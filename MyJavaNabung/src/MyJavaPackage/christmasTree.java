package MyJavaPackage;

public class christmasTree {

    public static final String GREEN = "\u001B[32m";
    public static final String BROWN = "\u001B[38;5;94m";  // Brown color (ANSI 256)
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        int height = 20;  // Tree height

        // Print the leaves
        for (int i = 0; i < height; i++) {
            // Print spaces
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars in green
            System.out.print(GREEN);
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println(RESET);
        }

        // Print the trunk (3 lines)
        for (int i = 0; i < 3; i++) {							
            for (int j = 0; j < height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(BROWN + "|" + RESET);
        }
    }
}
	