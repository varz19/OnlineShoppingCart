package OnlineShoppingCart;

public class ElectronicProduct extends Product {
	
	private int warrantyPeriod;
	
	public ElectronicProduct(int productId, String productName,
            double price, int quantity, int warrantyPeriod) {

  super(productId, productName, price, quantity);
this.warrantyPeriod = warrantyPeriod;
}	
	
	public int getWarrantyPeriod() {
	    return warrantyPeriod;
	}
	
	
	public void setWarrantyPeriod(int warrantyPeriod) {
	    this.warrantyPeriod = warrantyPeriod;
	}
	
	
	@Override
	public void displayProductDetails() {
	    super.displayProductDetails();
	    System.out.println("Warranty Period: " + warrantyPeriod + " months");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
