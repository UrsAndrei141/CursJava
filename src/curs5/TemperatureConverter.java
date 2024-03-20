package curs5;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of temperature values you want to convert: ");
        int numTemperatures = scanner.nextInt();
        scanner.close();
        
        
        for (int i = 1; i <= numTemperatures; i++) {
            System.out.print("Enter temperature value number " + i + " in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            
            System.out.println("Celsius temperature " + i + " in Fahrenheit: " + fahrenheit);
        }
       // scanner.close();
    }
    
}