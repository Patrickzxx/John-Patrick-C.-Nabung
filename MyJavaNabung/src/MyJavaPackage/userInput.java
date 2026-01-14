package MyJavaPackage;

import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is you Name?");
		String name = userInput.nextLine();
		System.out.println("You are " + name + "!");
		System.out.println("How old are you?");
		int age = userInput.nextInt();
		System.out.println("What it's your birth year");
		int birthyear = userInput.nextInt();
		System.out.println("What is your height");
		int height = userInput.nextInt();
		System.out.println( name + " your height is " + height +"cm");
		System.out.println("What is your weight");
		int weight = userInput.nextInt();
		System.out.println( name + " your weight is " + weight +"kg");
		System.out.println( name + " you are " +  age + "years old, " + "and your birthday is "  + birthyear +  ", your height is " + height + "cm " + "and your weight is " + weight + "kg" );
		
		
}
}


