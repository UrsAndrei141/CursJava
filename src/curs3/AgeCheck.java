package curs3;

import java.util.Scanner;

/*
 * Scriem un program care intreaba utilizatorul ce varsta are.
 * Daca utilizatorul introduce o valoare sub 18 , printeaza ”Esti minor”
 * Daca utilizatorul introduce o valoare intre 18 si 65, printeaza ”Esti
   adult” (conditii multiple deci folosim if ((conditie 1)&&(conditie 2)))
   Daca utilizatorul introduce o valoare peste 65 , printeaza ”Esti
   batran”
 */

public class AgeCheck {
	
	int age;
	
	
	public void askTheUserForTheAge() {
		Scanner scan = new Scanner(System.in);
			
			System.out.println("Introdu varsta:");
			age = scan.nextInt();
			
		
			scan.close();
			
		}
	
public void checkUserAge() {
		
		askTheUserForTheAge();
		
		if(age < 18 ) {
			System.out.println("Esti minor.");
		}else if(age >= 18 && age <= 65 ){
			System.out.println("Esti adult.");
		}else {
			System.out.println("Esti batran.");
		}
			
		}
		
		

}
