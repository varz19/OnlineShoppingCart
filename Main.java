
package OnlineShoppingCart;

public class Main {

    public static void main(String[] args) {

        // Create Electronic Product
        ElectronicProduct laptop = new ElectronicProduct(
            101,
            "Laptop",
            3500.0,
            2,
            24
        );

        // Create Shopping Cart
        ShoppingCart cart = new ShoppingCart();

        // Create Food Product
        FoodProduct food = new FoodProduct(
            201,
            "Milk",
            8.0,
            2,
            "2026-12-30"
        );

        // Create Clothing Product
        ClothingProduct shirt = new ClothingProduct(
            102,
            "Shirt",
            150.0,
            3,
            "L"
        );

        // Handle Exceptions
        try {

            cart.addProduct(laptop);
            cart.addProduct(shirt);
            cart.addProduct(food);

            cart.checkQuantity(food, 5);

        }
        catch (InvalidProductException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientQuantityException e) {
            System.out.println(e.getMessage());
        }

        // Display Bill
        cart.generateBill();

        // Count Products
        System.out.println(
            "Number of products: " + cart.countProducts()
        );

        // Lambda
        cart.displayCartLambda();

        // Streams - Filter
        cart.filterExpensiveProducts();

        // Streams - Sorted
        cart.sortProductsByPrice();

    }













}


	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


