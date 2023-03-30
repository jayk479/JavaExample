package homework;

public class Product {

	String productName;
	int price;
	
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
//		for (int i = 0; i < products.length; i++) {
//			if(max < products[i].price) {
//				max = products[i].price;
//			}
//		}
		
	}
}
