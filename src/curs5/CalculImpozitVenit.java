package curs5;

import java.util.Scanner;

/*
 * Facem un program care calculeaza impozitul global
 * intrebam userul cate venituri are
 * pentru fiecare venit in parte, calculam impozitul
 * 
 * Daca venitul <= 50000 atunci impozitul este 0.1, daca nu, este 0.15
 *
 * La final printram impozitul total
 */

public class CalculImpozitVenit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Cate surse de venit ai?");
		int numarVenituri = scan.nextInt();
		double impozitTotal = 0;
		
		for(int i=1; i <= numarVenituri; i++) {
			
			System.out.println("Introdu venitul nr " + i);
			double venit = scan.nextDouble();
			
			double impozit;
			
			if(venit <=5000) {
				impozit = venit*0.1;
			}else {
				impozit = venit*0.15;
			}
			
			impozitTotal = impozitTotal + impozit;
		}
		
		System.out.println("Impozitul total este :" + impozitTotal);
		
		

	}

}
