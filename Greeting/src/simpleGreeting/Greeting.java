package simpleGreeting;


import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		
		Nigeria ng = new Nigeria();
		China ch = new China ();
		Britain uk = new Britain ();
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Hello what country are you from?");
		String answer = scan.nextLine(); 
		if(answer.equalsIgnoreCase("Nigeria")){
			ng.greetNigerians();
		
		}else if (answer.equalsIgnoreCase("China")){
			ch.greetChina();
			
		}else if(answer.equalsIgnoreCase("Britain")){
			uk.greetBritain();
			
		}else{System.out.println("There is no such country in this assignment");
			
		}

	}

}
