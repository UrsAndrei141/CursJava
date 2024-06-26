package curs8;

import java.util.Scanner;

/*
 * Intrebam userul un calificativ
 * in functie de raspuns printram urmatoarele:
 * 
 * A --> Felicitari!
 * B --> Destul de bine!
 * C --> Suficient!
 * D --> Insuficient!
 * 
 * Pentru orice alt calificativ, printam: "Calificativ invalid!"
 * 
 */

public class SwitchExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introdu un calificativ:");
		String calificativ = scan.next().toUpperCase();
		
		//if-else
		if(calificativ.equalsIgnoreCase("A")) {
			System.out.println("Felicitari!");
		}else if(calificativ.equals("B")) {
			System.out.println("Destul de bine!");
		}else if(calificativ.equals("C")) {
			System.out.println("Suficient!");
		}else if(calificativ.equals("D")) {
			System.out.println("Insuficient!");
	    }else {
	    	System.out.println("Calificativ invalid");
	    }
		
		System.out.println("------------------------------");
	
		
		//switch
		switch(calificativ) {
		
		case "A" :
			System.out.println("Felicitari!");
			break;
		case "B" :
			System.out.println("Destul de bine!");
			break;
		case "C" :
			System.out.println("Suficient!");
			break;
		case "D" :
			System.out.println("Insuficient!");
			break;
			default :
				System.out.println("Calificativ invalid");
				
			
			
			
		}
		
		
	}

}
