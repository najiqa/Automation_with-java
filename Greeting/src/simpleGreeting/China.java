package simpleGreeting;

import java.util.Scanner;

public class China {
	public void greetChina(){
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your Chinese name?");
		String name = scan.nextLine();
		System.out.println("Hi"+name+ " Da Jia Hao");
		System.out.println("How are things?");
	}

}
