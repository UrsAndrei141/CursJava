package curs3;

import java.util.Scanner;

/*
 * Scriem un program care intreaba utilizatorul ce zi este astazi.
 * Utilizatorul trebuie sa introduca un numar de la 1 -7
 * Daca introduce zero – printam “Te rog sa introduci un numar mai
   mare ca 0”
 * Daca introduce 1 – printam “Astazi este luni”
 * Daca introuce 2 – Printam ”Astazi este marti”
 * Si tot asa pana duminica
 * Daca introduce un numar mai mare ca 7 printam : ”Saptamana are
   doar 7 zile te rog sa introduci un numar valid”
 */

public class WeekDay {
	
	int weekday;
	
	public void askTheUserForTheWeekDay() {
	
	     Scanner scan = new Scanner(System.in);
	
	      System.out.println("Introdu ziua saptamanii:");
	      weekday = scan.nextInt();
	
	     scan.close();
	
}
	
public void checkWeekDay() {
		
		askTheUserForTheWeekDay();
		
		if(weekday <= 0 ) {
			System.out.println("Te rog sa introduci un numar mai mare ca 0.");
		}else if(weekday == 1) {
			System.out.println("Astazi este luni.");	
		}else if(weekday == 2) {
			System.out.println("Astazi este marti.");
		}else if(weekday == 3) {
			System.out.println("Astazi este miercuri.");
		}else if(weekday == 4) {
			System.out.println("Astazi este joi.");
		}else if(weekday == 5) {
			System.out.println("Astazi este vineri.");
		}else if(weekday == 6) {
			System.out.println("Astazi este sambata.");
		}else if(weekday == 7) {
			System.out.println("Astazi este duminica.");
		}else {
			System.out.println("Saptamana are doar 7 zile, te rog sa introduci un numar valid.");
		}
			
		}
	
}

