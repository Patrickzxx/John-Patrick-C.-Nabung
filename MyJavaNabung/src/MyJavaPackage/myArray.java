package MyJavaPackage;

public class myArray {

	public static void main(String[] args) {
		// Declare array of Object type
        Object[] mixedArray = new Object[5];

        // Assign different types to the array
        mixedArray[0] = 42;           // int
        mixedArray[1] = "Hello";      // String
        mixedArray[2] = 123456789L;   // long
        mixedArray[3] = 3.14f;        // float
        mixedArray[4] = 2.71828;      // double

        // Print each element with its type
        for (Object obj : mixedArray) {
            System.out.println(obj + " (" + obj.getClass().getSimpleName() + ")");
        }

	}

}