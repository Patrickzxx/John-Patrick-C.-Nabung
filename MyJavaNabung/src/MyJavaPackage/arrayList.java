package MyJavaPackage; 

import java.util.ArrayList;
import java.util.Scanner;

class Burger {
    private String name;
    private String recipe;
    private double basePrice;

    public Burger(String name, String recipe, double basePrice) {
        this.name = name;
        this.recipe = recipe;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public String getRecipe() {
        return recipe;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void displayInfo(int index) {
        System.out.printf("%d. %s - $%.2f\n", index, name, basePrice);
        System.out.println("   Recipe: " + recipe);
    }
}

public class arrayList{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Burger> burgerMenu = new ArrayList<>();

        // Sample burgers
        burgerMenu.add(new Burger("Classic Cheeseburger", "Beef patty, cheese, lettuce, tomato", 25.0));
        burgerMenu.add(new Burger("BBQ Bacon Burger", "Beef patty, bacon, BBQ sauce, cheese", 30.0));
        burgerMenu.add(new Burger("Veggie Delight", "Grilled veggies, lettuce, tomato, sauce", 20.0));

        final double EXTRA_SAUCE_COST = 5.0;

        int choice;

        do {
            System.out.println("\n=== BURGER SHOP MENU ===");
            System.out.println("1. View Burgers");
            System.out.println("2. Buy Customized Burger");
            System.out.println("3. Exit");

            choice = getValidIntInput(scanner, "Enter your choice (1-3): ", 1, 3);

            switch (choice) {
                case 1:
                    System.out.println("\n--- Burger Menu ---");
                    for (int i = 0; i < burgerMenu.size(); i++) {
                        burgerMenu.get(i).displayInfo(i + 1);
                    }
                    break;

                case 2:
                    System.out.println("\n--- Buy Burger ---");
                    for (int i = 0; i < burgerMenu.size(); i++) {
                        burgerMenu.get(i).displayInfo(i + 1);
                    }

                    int burgerChoice = getValidIntInput(scanner, "Select burger number to buy: ", 1, burgerMenu.size());
                    Burger selectedBurger = burgerMenu.get(burgerChoice - 1);

                    boolean extraSauce = getYesNoInput(scanner, "Add extra sauce? (+$5.00) (yes/no): ");
                    boolean spicy = getYesNoInput(scanner, "Make it spicy? (no extra cost) (yes/no): ");

                    // Calculate total price after customization
                    double totalPrice = selectedBurger.getBasePrice();
                    if (extraSauce) {
                        totalPrice += EXTRA_SAUCE_COST;
                    }

                    System.out.printf("\nYour customized burger total is: $%.2f\n", totalPrice);

                    double payment = 0;
                    do {
                        System.out.print("Please enter payment amount: $");
                        if (scanner.hasNextDouble()) {
                            payment = scanner.nextDouble();
                            scanner.nextLine(); // consume newline
                            if (payment < totalPrice) {
                                System.out.printf("Insufficient payment. You still owe $%.2f\n", totalPrice - payment);
                            }
                        } else {
                            System.out.println("Invalid input. Please enter a valid number.");
                            scanner.nextLine(); // discard invalid input
                        }
                    } while (payment < totalPrice);

                    double change = payment - totalPrice;
                    System.out.println("Payment accepted. Thank you for your purchase!");
                    if (change > 0) {
                        System.out.printf("Your change: $%.2f\n", change);
                    }

                    System.out.println("You bought a '" + selectedBurger.getName() + "'" +
                            (extraSauce ? " with extra sauce" : "") +
                            (spicy ? " spicy" : "") + ". Enjoy!");
                    break;

                case 3:
                    System.out.println("Thanks for visiting! Goodbye.");
                    break;
            }

        } while (choice != 3);

        scanner.close();
    }

    private static int getValidIntInput(Scanner scanner, String prompt, int min, int max) {
        int input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (input >= min && input <= max) {
                    return input;
                }
                System.out.println("Please enter a number between " + min + " and " + max + ".");
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    private static boolean getYesNoInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("yes")) {
                return true;
            }
            if (input.equals("no")) {
                return false;
            }
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }
    }
}
