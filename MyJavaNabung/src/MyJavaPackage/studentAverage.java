package MyJavaPackage;

public class studentAverage {

    public static void main(String[] args) {
        printStudentName();
        System.out.println("Age: " + getStudentAge());

        // Grades for 3 subjects
        int math = 88;
        int science = 92;
        int english = 85;

        // Call method to calculate average
        double average = getAverage(math, science, english);
        System.out.println("Average Grade: " + average);
    }

    // Method to print student name
    public static void printStudentName() {
        System.out.println("Student Name: John Patrick C. Nabung"); // Change as needed
    }

    // Method to return student age
    public static int getStudentAge() {
        return 17;
    }

    // Method to calculate and return average
    public static double getAverage(int grade1, int grade2, int grade3) {
        int total = sum(grade1, grade2, grade3);
        return divide(total, 3);
    }

    // Sum of three integers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Division method with zero check
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return (double) a / b;
    }
}
