package OnlineShoppingCart;

public class FoodProduct extends Product {
	private String expirationDate;
	
	public FoodProduct(int productId, String productName,
	        double price, int quantity, String expirationDate) {

	    super(productId, productName, price, quantity);
	    this.expirationDate = expirationDate;
	}

	
	
	public String getExpirationDate() {
	    return expirationDate;
	}
	
	
	public void setExpirationDate(String expirationDate) {
	    this.expirationDate = expirationDate;
	}
	
	
	
	
	@Override
	public void displayProductDetails() {
	    super.displayProductDetails();
	    System.out.println("Expiration Date: " + expirationDate);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
