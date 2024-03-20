package curs4;


import java.util.Scanner;

public class BillDiscount {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total amount: ");
        int total = scanner.nextInt();
        scanner.close();

   
        double discount = (total > 100) ? 0.1 : 0.05;
        double discountedPrice = total - (total * discount);

        System.out.println("Discounted price: " + discountedPrice);
    }
}
