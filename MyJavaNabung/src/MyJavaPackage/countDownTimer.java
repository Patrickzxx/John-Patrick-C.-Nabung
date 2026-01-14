package MyJavaPackage;

import java.util.Scanner;

public class countDownTimer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Count Down Timer!!!");
		System.out.println("How many Minutes?");
		int min = input.nextInt();
		System.out.println("How many Seconds");
		int sec = input.nextInt();
		int millsec = 59;
		boolean secRep = false,millRep=false;
		while (min>=0) {
			if(secRep) {
				sec=59;
			}
			while (sec>=0) {
				millsec=59;
				while(millsec>=0) {
					System.out.println(min+":" +sec+":"+millsec--);
			try {
			Thread.sleep(200);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
				}
		}
		sec--;
		secRep = true;
	}
min--;
}
}
}
