package curs6;

import java.util.Scanner;

/*
 * simulam o retragere de la ATm
 * avem un sold initial de 1500
 * intreb usuerul cat vrea sa retraga si verific daca suma nu este mai mare decat soldul
 * daca suma este mai mare, ii printez fonduri insuficiente si il rog sa incerce din nou
 * la final printez : Retragere cu succes ! Sold ramas:
 * 
 */

public class RetragereATM {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sold = 1500;
		System.out.println("Ce suma vrei sa retragi?");
		int suma = scan.nextInt();
		
		while (suma > sold || suma <= 0) {
			System.out.println("Suma invalida!");
			System.out.println("Ce suma vrei sa retragi?");
			suma = scan.nextInt();
		}
		sold = sold - suma;
		System.out.println("Retragere cu success! Noul sold este: " + sold );
		

	}

}
