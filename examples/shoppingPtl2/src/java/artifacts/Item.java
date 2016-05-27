package artifacts;

public class Item {
	private String product;
	private int amount;
	private double total;
	
	public Item(String product, int amount, double total) {
		this.product = product;
		this.amount = amount;
		this.total = total;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
