package OnlineShoppingCart;

public class ClothingProduct extends Product {
	
	private String size;
	
	public ClothingProduct(int productId, String productName,
	        double price, int quantity, String size) {

	    super(productId, productName, price, quantity);
	    this.size = size;
	}
	
	
	public String getSize() {
	    return size;
	}
	
	public void setSize(String size) {
	    this.size = size;
	}
	
	@Override
	public void displayProductDetails() {
	    super.displayProductDetails();
	    System.out.println("Size: " + size);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
