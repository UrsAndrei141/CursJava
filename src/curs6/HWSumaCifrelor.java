package curs6;

import java.util.Scanner;

public class HWSumaCifrelor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert the number to a string to get its length
        String numberString = Integer.toString(number);
        int length = numberString.length();

        // Create an array to store the digits
        int[] digits = new int[length];

        // Extract each digit and store it in the array
        for (int i = 0; i < length; i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
        }

        // Calculate the sum of digits
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }

        // Print the result
        System.out.println("Sum of digits of " + number + " = " + sum);

        scanner.close();
    }
}