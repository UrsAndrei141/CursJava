package curs3;

import java.util.Scanner;

/*
 * - Scriem un program care intreaba utilizatorul punctajul unui test.
   - Daca utilizatorul introduce o valoare intre 0 si 65 atunci printeaza ”Ai
     picat. Mai incearca”
   - Daca utilizatorul introduce o valoare mai mare sau egala cu 66
     atunci printeaza ”Felicitari, Ai trecut”
 */

public class Score {
	
	int punctaj;
	
	
	public void askTheUserForTheScore() {
		Scanner scan = new Scanner(System.in);
			
			System.out.println("Introdu punctajul testului:");
			punctaj = scan.nextInt();
			
		
			scan.close();
			
		}
	
	
	public void checkTestScore() {
		
		askTheUserForTheScore();
		
		if(punctaj <= 65 ) {
			System.out.println("Ai picat, mai incearca!");
		}else {
			System.out.println("Felicitari! Ai trecut!");
		}

}
}
