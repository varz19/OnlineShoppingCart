package OnlineShoppingCart;

import java.util.ArrayList;
public class ShoppingCart {
	private ArrayList<Product> products;
	
	public ShoppingCart() {
	    products = new ArrayList<>();
	}
	
	public void addProduct(Product product)
	        throws InvalidProductException {

	    if (product == null || product.getPrice() < 0) {
	        throw new InvalidProductException("Invalid product");
	    }

	    products.add(product);
	}
	
	
	
	public void removeProduct(int productId)
	        throws ProductNotFoundException {

	    boolean removed = products.removeIf(
	        product -> product.getProductId() == productId
	    );

	    if (!removed) {
	        throw new ProductNotFoundException("Product not found");
	    }
	    
	    
	}
	
	public void checkQuantity(Product product, int requestedQuantity)
	        throws InsufficientQuantityException {

	    if (requestedQuantity > product.getQuantity()) {
	        throw new InsufficientQuantityException(
	            "Insufficient quantity available"
	        );
	    }
	}
	
	
	
	
	
	
	
	
	
	public void displayCart() {
	    for (Product product : products) {
	        product.displayProductDetails();
	        System.out.println("----------------");
	    }
	}
	
	
	public double calculateTotal() {
	    double total = 0;

	    for (Product product : products) {
	        total += product.calculatePrice();
	    }

	    return total;
	}
	
	
	
	public void generateBill() {
	    displayCart();

	    System.out.println("Total: " + calculateTotal());
	}
	
	
	public void displayCartLambda() {
	    products.forEach(product ->
	        product.displayProductDetails()
	    );
	}
	
	
	
	public void filterExpensiveProducts() {
	    products.stream()
	        .filter(product -> product.getPrice() > 100)
	        .forEach(product -> product.displayProductDetails());
	}
	
	
	
	public void sortProductsByPrice() {
	    products.stream()
	        .sorted((p1, p2) ->
	            Double.compare(p1.getPrice(), p2.getPrice())
	        )
	        .forEach(product -> product.displayProductDetails());
	}
	
	
	
	public long countProducts() {
	    return products.stream().count();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
