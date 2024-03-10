package curs2;

public class TestRoom {

	private static String alb = "alb";

	public static void main(String[] args) {
		
		
		Room baie = new Room(4, 2, alb);
		System.out.println("Perimetru baie este: " + baie.calculPerimetru());
		System.out.println("Arie baie este: " + baie.calculArie());
		
		Room dormitor = new Room(8, 6, alb);
		System.out.println("Perimetru dormitor este: " + dormitor.calculPerimetru());
		System.out.println("Arie dormitor este: " + dormitor.calculArie());
		System.out.println("Culoare dormitor este: " + dormitor.afiseazaCuloareDreptunghi());
		
		Room bucatarie = new Room(5, 3, alb);
		System.out.println("Perimetru bucatarie este: " + bucatarie.calculPerimetru());
		System.out.println("Bucatarie dormitor este: " + bucatarie.calculArie());
		System.out.println("Culoare bucatarie este: " + bucatarie.afiseazaCuloareDreptunghi());
		
		
	}

}
