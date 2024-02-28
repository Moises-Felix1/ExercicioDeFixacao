package entities;

public class Product {

	private String product_name;
	private Double price;
	
	public Product() {
		
	}

	public Product(String product_name, Double price) {
		this.product_name = product_name;
		this.price = price;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
