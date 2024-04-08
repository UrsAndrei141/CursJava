package curs7;

import java.util.Scanner;

public class HWPinValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String defaultPin = "2244";
        final int maxAttempts = 3;
        int attempts = 0;

        System.out.println("Enter your PIN:");
        while (attempts < maxAttempts) {
            String inputPin = scanner.nextLine();

            if (inputPin.equals(defaultPin)) {
                System.out.println("Access granted!");
                break;
            } else {
                attempts++;
                if (attempts < maxAttempts) {
                    System.out.println("Wrong PIN. Please try again.");
                } else {
                    System.out.println("Maximum attempts reached. Card blocked.");
                }
            }
        }

        scanner.close();
    }
}
