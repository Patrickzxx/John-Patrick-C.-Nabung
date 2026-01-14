package MyJavaPackage;

public class myMethod {

    public static void main(String[] args) {
        print();
        myName();
        System.out.println(myAge());
        System.out.println(myLastName());
        System.out.println(sum(31, 53));
        
        int a = 31;
        int b = 53;
        
        System.out.println("Sum: " + sum(a, b));
        System.out.println("Plus: " + plus(a, b));
        System.out.println("Minus: " + minus(a, b));
        System.out.println("Multiply: " + multiply(a, b));
        System.out.println("Divide: " + divide(a, b));
    }

    // Method to print "Hello World"
    public static void print() {
        System.out.println("Hello World");
    }

    // Method to print your name
    public static void myName() {
        System.out.println("John"); // Replace with your name
    }

    // Method that returns your age
    public static int myAge() {
        return 25; // Replace with your age
    }

    // Method that returns your last name
    public static String myLastName() {
        return "Doe"; // Replace with your last name
    }

    // Method that takes two numbers and returns their sum
    public static int sum(int a, int b) {
        return a + b;
    }

public static int plus(int a, int b) {
    return a + b;
}

public static int minus(int a, int b) {
    return a - b;
}

public static int multiply(int a, int b) {
    return a * b;
}

public static double divide(int a, int b) {
    if (b == 0) {
        System.out.println("Error: Division by zero.");
        return 0;
    }
    return (double) a / b;
}
}
