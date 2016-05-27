package artifacts;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	private ArrayList<Item> itens = new ArrayList<Item>();
	private double total = 0;
	private String paymentForm = "money";
	private String clientName = null;
	
	public void addItem(Item item) {
		itens.add(item);
		total += item.getTotal();
	}
	
	public void removeItem(Item item) {
		if (itens.contains(item)) {
			itens.remove(item);
			total -= item.getTotal();
		}
	}
	
	public void setPaymentForm(String paymentForm) {
		this.paymentForm = paymentForm;
	}
	
	public List<Item> getItens() {
		return (List<Item>) itens.clone(); 
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getPaymentForm() {
		return paymentForm;
	}
}
