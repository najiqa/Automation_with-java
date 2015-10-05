package simpleGreeting;

import java.util.Scanner;

public class Nigeria {
	
	public void greetNigerians(){
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your Nigerian name?");
		String name = scan.nextLine();
		System.out.println("Hi"+name+" how you dey? Welcome o");
		System.out.println("How are things?");
	}

}
