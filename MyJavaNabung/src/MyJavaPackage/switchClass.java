package MyJavaPackage;

import java.util.Scanner;

public class switchClass {// main

	public static void main(String[] args) {// main static
    	Scanner input = new Scanner(System.in);
    	int ans;
    	int bal = 100;
    	System.out.println("Please select from the menu");
    	System.out.println("press 1 for bal");
    	System.out.println("press 2 for load");
    	System.out.println("press 3 for calls");
    	System.out.println("press 0 for exit");
    	ans = input.nextInt();
    	switch(ans) {// main
    	case 1:
    		System.out.println("You press for bal " + bal);
    		break;
    		
    	case 2:
        	System.out.println("Please select from the load prices");
        	System.out.println("press 1 for 10");
        	System.out.println("press 2 for 20");
        	System.out.println("press 3 for 50");
        	System.out.println("press 0 for exit");
        	ans = input.nextInt();
        	switch (ans) {// load
        	case 1: 
        		System.out.println("you loaded 10 pesos");
        		bal -= 10;
        		System.out.println("New Balance" + bal);
        		break;
        		
        	case 2: 
        		System.out.println("you loaded 20 pesos");
        		bal -= 20;
        		System.out.println("New Balance" + bal);
        		break;
        		
        	case 3: 
        		System.out.println("you loaded 50 pesos");
        		bal -= 50;
        		System.out.println("New Balance" + bal);
        		break;
        	default :
        		System.out.println("invalid input");
        	}// closing load
    		break;
    	case 3:
          	 System.out.println("Please select from the calls prices");
          	 System.out.println("press for 1 for unli all net calls(1day only) 20pesos");
               System.out.println("press for 2 for unli all net calls(for 3 days only) 50pesos ");
               System.out.println("press for 3 for unli all net calls(for 1 week only) 70 pesos");
               System.out.println("press 0 for exit");
               ans = input.nextInt();
               switch (ans) {
               case 1:
              	 System.out.println("you loaded 20 pesos");
              	 bal -= 20;
              	 System.out.println("new balance" + bal);
              	 break;
               case 2:
              	 System.out.println("you loaded 50 pesos");
              	 bal -= 50;
              	 System.out.println("new balance" + bal);
              	 break;
               case 3:
              	 System.out.println("you loaded 70 pesos");
              	 bal -= 70;
              	 System.out.println("new balance" + bal);
              	 break;
               case 0:
              	 System.out.println("you press 0");
              	 bal -= 0;
              	 System.out.println("balance" + bal);
              	 break;
               default:
          		 System.out.println("walang ganyan dambi");
               }
          	 break;
          	//data
        case 4:
       	 System.out.println("Please select from the data prices");
       	 System.out.println("press for 1 for 1 gb data(1day only) 10pesos");
            System.out.println("press for 2 for 3 gb data(for 2 days only) 30pesos ");
            System.out.println("press for 3 for 5 gb data(for 5 days only) 50 pesos");
            System.out.println("press for 0 exit");
            ans = input.nextInt();
            switch (ans) {
            case 1:
           	 System.out.println("you loaded 10 pesos which is (1gb for 1 day)");
           	 bal -= 10;
           	 System.out.println("new balance" + bal);
           	 break;
            case 2:
           	 System.out.println("you loaded 30 pesos which is (3gb for 2 days)");
           	 bal -= 30;
           	 System.out.println("new balance" + bal);
           	 break;
            case 3:
           	 System.out.println("you loaded 50 pesos which is (5gb for 5 days)");
           	 bal -= 50;
           	 System.out.println("new balance" + bal);
           	 break;
            case 0:
           	 System.out.println("you press 0");
           	 bal -= 0;
           	 System.out.println("balance" + bal);
           	 break; 
    		default:
    			System.out.println("Invalid Input");
           	 
                }
    	}// closing main switch
 
	}// closing main static

}//closing main