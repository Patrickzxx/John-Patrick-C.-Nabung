package MyJavaPackage;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sum of all numbers in between");
		System.out.println("Input first Num");
		int num1 = input.nextInt();
		System.out.println("Input second Num");
		int num2 = input.nextInt();
		int sum = 0;
		while (num1<=num2) {
			System.out.println("+" + num1);
			sum+=num1;
			num1++;
			try {
			Thread.sleep(200);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			}
		}
		System.out.println("=" + sum);
	}

}
