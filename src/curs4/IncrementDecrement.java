package curs4;

/*
 * operator unar: are un singur operand:  numar++ ==> numar = numar+1
 * operatori binari : doi operanzi:  var > var2
 * operator ternar : trei operanzi (operator conditional)   ? :
 * 
 */

public class IncrementDecrement {
	
	

	public static void main(String[] args) {
		
		//POST increment -->  numar++
		//PRE increment --> ++numar
		
		//POST decrement --> numar-- (numar = numar -1)
		//PRE decrement --> --numar
		
	
		System.out.println("---POST---");
		int num = 10;
		System.out.println("Valoare lui num inainte de increment:" + num);
		System.out.println("Valoare lui num in POST increment:" + num++); //num++ --> num= num+1
		System.out.println("Valoare lui num dupa POST increment:" + num);
		
		
		System.out.println("---PRE---");
		int num2 = 10;
		System.out.println("Valoare lui num inainte de increment:" + num2);
		System.out.println("Valoare lui num in PRE increment:" + ++num2); 
		System.out.println("Valoare lui num dupa PRE increment:" + num2);
		

	}

}
