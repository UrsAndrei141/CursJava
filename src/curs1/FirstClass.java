package curs1;

//comment on a single line

/*
 * comment on
 * multiple
 * lines
 */

//Clasele le denumim folosing conventia UpperCamelCase  --> ExempluClasa
//metode si variabile folosing lowerCamelCase --> exempluVariabila


public class FirstClass {

	public static void main(String[] args) {
		
		System.out.println("Test");
		
		FirstClass object = new FirstClass();
		object.greetings();

	}
	
	public void greetings () {
		
		System.out.println("Salut");
	}

}
