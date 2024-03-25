package curs6;

/*
 * TVA poate avea multiple valori
 * Vreau sa setez valoarea TVA pe obiect
 * Vreau sa afisez numarul total de calcule alte TVA pe care le-am facut
 */

public class CalculatorTVA {
	
	private double tvaDouble;
	private static int nrTotalDeCalcule;
	
	public CalculatorTVA(int tva) {
		this.tvaDouble = tva/100;
	}
	
	public double adunaTVA(double suma) {
		nrTotalDeCalcule++;
		
		return suma * (1 + tvaDouble);
	}
	
	public static int getNrTotalDeCalcule() {
		return nrTotalDeCalcule;
		
	}

}
