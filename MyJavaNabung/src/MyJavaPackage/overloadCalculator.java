package MyJavaPackage;

import java.util.Scanner;

public class overloadCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int choice;
        	System.out.println("Welcome to my Calculator");
        do {
            System.out.println("Overload Calculator ");
            System.out.println("1. Add +");
            System.out.println("2. Subtract -");
            System.out.println("3. Multiply x");
            System.out.println("4. Divide /");
            System.out.println("5. Exit :)");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();  // it accepts decimal
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();  // it accepts decimal

                switch (choice) {
                    case 1:
                        // it calls correct overloaded method automatically
                        System.out.println("Result: " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result: " + divide(num1, num2));
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        System.out.println("Calculator exited.");
        scanner.close();
    }

    //  $Overloaded Methods$

    // Addition
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return (double) a / b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }


	}


