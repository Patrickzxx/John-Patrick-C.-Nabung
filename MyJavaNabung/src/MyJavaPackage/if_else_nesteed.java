package MyJavaPackage;
import java.util.Scanner;
public class if_else_nesteed {

	public static void main(String[] args) {
		
		
		
		
//		System.out.println("Welcome to McDo!!!");
//		Scanner input = new Scanner(System.in);
//		int price = 100,payment = 0;
//		double discount,finalPrice;
//		System.out.println("What is your age?");
//		int age = input.nextInt();
//		
//		if(age>=60) {
//			System.out.println("Your are a senior");
//		    discount = price * 0.20;
//			finalPrice = price - discount;
//			System.out.println("Your going to pay!");
//			System.out.println(finalPrice);
//		} else if(age<=20) {
//			System.out.println("Your are a student!");
//			discount = price * 0.10;
//			finalPrice = price - discount;
//			System.out.println("Your going to pay!");
//			System.out.println(finalPrice);
//		} else {
//			System.out.println("Your are a regular Customer");
//			payment = price;
//			System.out.println("Your going to pay!");
//			System.out.println(payment);
//		}
//		input.close();
		
		System.out.println("Welcome to guess the card game!!!");
		Scanner input = new Scanner(System.in);
		String cardColor, cardSuit;
		System.out.println("What is the color of your card?");
		cardColor = input.nextLine().toLowerCase();
		
		
		if(cardColor.equals("red")){
			System.out.println("Your card is color red");
			System.out.println("What suit is your card?");
			cardSuit = input.nextLine().toLowerCase();
			if(cardSuit.equals("heart")) {//nested if else!!!
				System.out.println("Your card suit is heart");
			}else if(cardSuit.equals("diamond")) {
				System.out.println("Your card suit is diamond");
				}
		}
				
		else if(cardColor.equals("black")) {
				System.out.println("Your card is color black");
				System.out.println("What suit is your card?");
				cardSuit = input.nextLine().toLowerCase();
			if(cardSuit.equals("flower")) {
				System.out.println("Your card suit is flower");
			}else if(cardSuit.equals("spade")) {
				System.out.println("Your card suit is Spade");
				}
		} else {//default value
			System.out.println("There is no such color!");
		}
		

		
//		if(age>=60) {
//			System.out.println("Your are a senior");
//		    discount = price * 0.20;
//			finalPrice = price - discount;
//			System.out.println("Your going to pay!");
//			System.out.println(finalPrice);
//		} else if(age<=20) {
//			System.out.println("Your are a student!");
//			discount = price * 0.10;
//			finalPrice = price - discount;
//			System.out.println("Your going to pay!");
//			System.out.println(finalPrice);
//		} else {
//			System.out.println("Your are a regular Customer");
//			payment = price;
//			System.out.println("Your going to pay!");
//			System.out.println(payment);
//		}
//		input.close();
//
	}

}
