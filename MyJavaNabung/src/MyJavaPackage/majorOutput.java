package MyJavaPackage;

import java.util.Scanner;           // Import Scanner class (for user input)
import java.time.LocalDate;         // Import LocalDate class (for current date)

// CLASS
public class majorOutput {
    public static void main(String[] args) {
        // Create Scanner object for user input  → SCANNER
        Scanner scanner = new Scanner(System.in);
        
        // VARIABLES
        int age, yearOfBirth, currentYear;           // → These are VARIABLES
        int birthDay, birthMonth;                    // → These are VARIABLES

        // Get current year using LocalDate         → METHOD CALL
        currentYear = LocalDate.now().getYear();     // → VARIABLE ASSIGNMENT using METHOD

        // Ask the user for their age               → SCANNER INPUT
        System.out.print("Enter your age: ");
        age = scanner.nextInt();                     // → VARIABLE (age) from SCANNER

        // OPERATOR: Calculate birth year
        yearOfBirth = currentYear - age;             // → OPERATOR (-)
        System.out.println("You were born in the year: " + yearOfBirth);  // OUTPUT

        // Ask for the user's birth month and day   → SCANNER INPUT
        System.out.print("Enter your birth month (1-12): ");
        birthMonth = scanner.nextInt();              // → VARIABLE from SCANNER
        System.out.print("Enter your birth day (1-31): ");
        birthDay = scanner.nextInt();                // → VARIABLE from SCANNER

        // Get the current date using LocalDate     → METHOD CALL
        LocalDate today = LocalDate.now();           // → OBJECT creation
        int currentMonth = today.getMonthValue();    // → VARIABLE
        int currentDay = today.getDayOfMonth();      // → VARIABLE

        // NESTED IF ELSE (check for birthday)
        if (birthMonth == currentMonth && birthDay == currentDay) {     // → LOGICAL OPERATORS (==, &&)
            System.out.println("Happy Birthday! 🎉");
        } else {
            System.out.println("Today is not your birthday.");
        }

        // WHILE LOOP begins here
        while (true) {
            // Display menu
            System.out.println("\nDo you want to calculate your age for a different year?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter your choice (1 or 2): ");

            int choice = scanner.nextInt();          // → SCANNER INPUT

            // SWITCH STATEMENT
            switch (choice) {
                case 1:
                    // Ask for a different year      → SCANNER INPUT
                    System.out.print("Enter the year you want to calculate your age for: ");
                    int yearToCheck = scanner.nextInt();            // → VARIABLE
                    int ageInYear = yearToCheck - yearOfBirth;      // → OPERATOR (-)
                    System.out.println("You will be " + ageInYear + " years old in the year " + yearToCheck + ".");
                    break;

                case 2:
                    System.out.println("Goodbye!");
                    scanner.close();     // → CLOSE SCANNER
                    return;              // → EXIT PROGRAM

                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");  // → DEFAULT CASE
            }
        }
    }
}
