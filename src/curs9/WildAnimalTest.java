package curs9;

/*
 * Method override - suprascrierea metodei
 * - implica o relatie de mostenira pt ca suprascrierea se face in clasa copil (subclasa),
 * si presupune scrierea identica a metodei din clasa parinte (super clasa)
 * DAR cu o alta implementare
 * -este best practice ca metode suprascrisa sa aiba //@Override deasupra clasei
 */

public class WildAnimalTest {

	public static void main(String[] args) {
		
		
		Lion simba = new Lion();
		simba.makeSound(); //metoda suprascrisa
		simba.whereDoesItLive();
		simba.eatMeat();
		
		System.out.println("---------------------------------");
		
		Deer bambi = new Deer();
		bambi.makeSound(); //method override
		bambi.whereDoesItLive();
		bambi.eatGrass();

	}

}
