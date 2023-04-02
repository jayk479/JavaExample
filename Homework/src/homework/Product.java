package homework;

public class Product {

	String productName;
	int price;
	// Product[] products = null;
	
	public Product() {
		
	}
	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}
	
	public int maxPrice() {
		int max = 0;
		// Product[] products = new Product();
		if(max < price) {
			max = price;
		}
		return max;

		
	}
}
