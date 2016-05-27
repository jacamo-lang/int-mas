package artifacts;

public class Product {
	private String product;
	private int stock;
	private double price;
	
	public Product(String product, int stock, double price) {
		this.product = product;
		this.stock = stock;
		this.price = price;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void decreaseStock(int amount) {
		this.stock -= amount;
	}
}
