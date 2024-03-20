package curs4;

import java.util.Scanner;

public class Calificativ {

public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu punctajul: ");
        int punctaj = scanner.nextInt();
        scanner.close();

   
        String calificativ = (punctaj >= 90) ? "FB" : (punctaj >= 80) ? "B" : "Suficient";

        System.out.println("Calificativul obtinut este: " + calificativ);
    }

}
