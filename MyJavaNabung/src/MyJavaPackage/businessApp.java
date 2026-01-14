package MyJavaPackage;

import java.util.HashMap;
import java.util.Scanner;

public class businessApp {

    // HashMap to store product name and product details (inventory)
    private static HashMap<String, Product> inventory = new HashMap<>();
    private static double totalRevenue = 0.0;  // To track total revenue from sales

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Business Management Application!");

        // Main loop for the app
        do {
            System.out.println("\nBusiness App Menu");
            System.out.println("1. Purchase a Product");
            System.out.println("2. Get Product Price (Prize)");
            System.out.println("3. Sell a Product");
            System.out.println("4. View Inventory");
            System.out.println("5. View Total Revenue");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    purchase(scanner);  // Calls method to purchase products
                    break;
                case 2:
                    prize(scanner);  // Calls method to check product price
                    break;
                case 3:
                    sale(scanner);  // Calls method to sell products
                    break;
                case 4:
                    viewInventory();  // Shows current inventory status
                    break;
                case 5:
                    viewTotalRevenue();  // Shows total revenue from sales
                    break;
                case 6:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

    /**
     * Method for purchasing a product and adding it to the inventory.
     * If the product exists, the stock is updated. If it's a new product,
     * it's added to the inventory.
     *
     * @param scanner The Scanner object for user input.
     */
    private static void purchase(Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.next();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter quantity to purchase: ");
        int quantity = scanner.nextInt();

        // If the product exists in the inventory, update the quantity and price
        if (inventory.containsKey(name)) {
            Product existingProduct = inventory.get(name);
            existingProduct.increaseQuantity(quantity);  // Increase stock
            existingProduct.setPrice(price);  // Update price if necessary
        } else {
            // If the product is new, create and add it to the inventory
            Product newProduct = new Product(name, price, quantity);
            inventory.put(name, newProduct);
        }

        System.out.println("Purchased " + quantity + " units of " + name + " at $" + price + " each.");
    }

    /**
     * Method for checking the price (prize) of a product.
     * It allows the user to look up the price of a product in the inventory.
     *
     * @param scanner The Scanner object for user input.
     */
    private static void prize(Scanner scanner) {
        System.out.print("Enter product name to check price: ");
        String name = scanner.next();

        // Check if the product exists in inventory
        if (inventory.containsKey(name)) {
            double price = inventory.get(name).getPrice();
            System.out.println("The price of " + name + " is $" + price);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    /**
     * Method for selling a product.
     * It decreases the quantity of the product from inventory and
     * calculates the revenue from the sale. The total revenue is updated.
     *
     * @param scanner The Scanner object for user input.
     */
    private static void sale(Scanner scanner) {
        System.out.print("Enter product name to sell: ");
        String name = scanner.next();
        System.out.print("Enter quantity to sell: ");
        int quantity = scanner.nextInt();

        // Check if the product exists in inventory
        if (inventory.containsKey(name)) {
            Product product = inventory.get(name);

            // Ensure there is enough stock to sell
            if (product.decreaseQuantity(quantity)) {
                double totalSale = quantity * product.getPrice();  // Calculate total sale
                totalRevenue += totalSale;  // Add the revenue to total revenue
                System.out.println("Sold " + quantity + " units of " + name + " for a total of $" + totalSale);
            } else {
                System.out.println("Insufficient stock for sale.");
            }
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    /**
     * Method to view the current inventory status.
     * It lists all products, their prices, and available quantities.
     */
    private static void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("\nCurrent Inventory:");
            // Loop through all products in inventory and print their details
            for (String name : inventory.keySet()) {
                Product product = inventory.get(name);
                System.out.println("Product: " + name + ", Price: $" + product.getPrice() + ", Quantity: " + product.getQuantity());
            }
        }
    }

    /**
     * Method to view the total revenue from all completed sales.
     */
    private static void viewTotalRevenue() {
        System.out.println("Total Revenue from Sales: $" + totalRevenue);
    }

    // Product class to handle product details and actions
    static class Product {
        private String name;
        private double price;
        private int quantity;

        // Constructor to initialize a new product
        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;  // Allows price update
        }

        public boolean decreaseQuantity(int quantitySold) {
            // Check if enough stock is available for the sale
            if (quantity >= quantitySold) {
                quantity -= quantitySold;  // Decrease stock
                return true;
            }
            return false;  // Not enough stock
        }

        public void increaseQuantity(int quantityPurchased) {
            this.quantity += quantityPurchased;  // Increase stock
        }

        public int getQuantity() {
            return quantity;
        }
    }
}
