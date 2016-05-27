// CArtAgO artifact code for project shoppingPtl2

package artifacts;

import jason.asSyntax.Atom;
import jason.asSyntax.NumberTermImpl;
import jason.asSyntax.Term;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import ora4mas.nopl.JasonTermWrapper;

import cartago.*;

public class SalesSystem extends Artifact {
	private HashMap<String, Product> stock = new HashMap<String, Product>();
	private ArrayList<Sale> sales = new ArrayList<Sale>();
	private ArtifactId eptArtifact = null;
	
	private Sale currentSale = null;
	private HashMap<String, ObsProperty> stockProp = new HashMap<String, ObsProperty>();
	
	void init() {
		stock.put("bread", new Product("bread", 14, 1.33));
		stock.put("milk", new Product("milk", 23, 3.75));
		stock.put("orange", new Product("orange", 16, 0.34));
		
		defineObsProperty("total", 0);
		generateStockProperties();
	}
	
	@INTERNAL_OPERATION
	void createEPTArtifact() {
		if (eptArtifact == null) {
			try {
				eptArtifact = lookupArtifact("eptArt");
				
				System.out.println("OK!!!");
			} catch (OperationException e) {
				try {
					eptArtifact = makeArtifact("eptArt", 
							"artifacts.EPT", 
							ArtifactConfig.DEFAULT_CONFIG);
					System.out.println("OK!!! 2222");
				} catch (OperationException e1) {
					failed("There was problem to create a timeout artifact");
				}
			}
		}
	}
	
	@OPERATION
	void newSale(String product, double price, int amount) {
		System.out.println("Adding product " + product + " with price " + price + " and amount " + amount);
		if (currentSale == null) {
			Product p = stock.get(product);
			if (p == null) {
				failed("product_not_found");
			} else {
				if (amount > p.getStock()) {
					failed("no_stock");
				} else {
					createEPTArtifact();
					currentSale = new Sale();
					currentSale.addItem(new Item(product, amount, price * amount));
					
					ObsProperty currentTotal = getObsProperty("total");
					currentTotal.updateValue(currentSale.getTotal());
				}
			}
		} else {
			failed("system_busy");
		}
	}

	@OPERATION
	void setClient(String clientName) {
		if (currentSale != null) {
			currentSale.setClientName(clientName);
		} else {
			failed("no_sale_started");
		}
	}
	
	@OPERATION //TODO permitir outras formas de pagamento? alterar protocolo?
	void paymentForm(String paymentForm) {
		if (currentSale != null) {
			currentSale.setPaymentForm(paymentForm);
			if (paymentForm.equals("card")) {
				useEPT();
			}
		} else {
			failed("no_sale_started");
		}
	}
	
	private void useEPT() {
		try {
			if (eptArtifact == null)
				createEPTArtifact();
			
			execLinkedOp(eptArtifact, "askPassword", currentSale.getClientName());
		} catch (OperationException e) {
			e.printStackTrace();
		}
	}
	
	@OPERATION
	void finishSale() {
		System.out.println("Finishing...");
		if (currentSale != null) {
			sales.add(currentSale);
			updateStock();
			currentSale = null;
			
			ObsProperty currentTotal = getObsProperty("total");
			currentTotal.updateValue(0);
		} else {
			failed("no_sale_started");
		}
	}
	
	private void updateStock() {
		List<Item> itens = currentSale.getItens();
		for (Item i : itens) {
			stock.get(i.getProduct()).decreaseStock(i.getAmount());
		}
		generateStockProperties();
	}
	
	private void generateStockProperty(Product p) {
		Term product = new Atom(p.getProduct());
		Term price = new NumberTermImpl(p.getPrice());
		Term stock = new NumberTermImpl(p.getStock());
		
		Object[] o = getTermsAsProlog(product, price, stock);
		defineObsProperty("stock", o);	
		
		stockProp.put(p.getProduct(), getObsPropertyByTemplate("stock", o));
	}
	
	private void generateStockProperties() {
		for (Entry<String, Product> cp : stock.entrySet()) {
			ObsProperty currentCP = stockProp.get(cp.getKey());
			if (currentCP == null) {
				generateStockProperty(cp.getValue());
			} else {
				
				JasonTermWrapper termWrap = (JasonTermWrapper) currentCP.getValue(currentCP.getValues().length-1);
				
				if (Integer.valueOf(termWrap.getAsPrologStr()) != cp.getValue().getStock()) {
					removeObsPropertyByTemplate(currentCP.getName(), currentCP.getValues());
					generateStockProperty(cp.getValue());
				}
			}
		}
	}
	
	private Object[] getTermsAsProlog(Term... o) {
		Object[] terms = new Object[o.length];
		int i = 0;
		for (Term t : o)
			terms[i++] = new JasonTermWrapper(t);

		return terms;
	}
}

