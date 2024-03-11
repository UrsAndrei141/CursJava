package curs3;

import java.util.Scanner;

/*
 * Program care citeste un nr de la tastatura si verifica daca este o zi lucratoare sau este weekend
 * Ex.: citeste 1 --> It's a working day
 *      citeste 7 --> It's weekend
 *      citeste 9 --> Invalid day 
 */

public class CheckWorkingDay {
	
    int zi;
	
	public void askTheUserForADay() {
		
		System.out.println("Please enter a day:");
		Scanner scan = new Scanner(System.in);
		zi = scan.nextInt();
		
	}
	
	public void checkDay() {
		askTheUserForADay();
		// && --> AND
		// || --> OR
		if( zi >= 1 && zi <= 5 ) {
			System.out.println("It's a working day");
		}else if( zi == 6 || zi == 7 ) {
			System.out.println("It's weekend!");
		}else {
			System.out.println("Invalid no. for the day");
			
		}
		
	}

}
