package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose sandwich size (1 for Regular, 2 for Large): ");
        int size = scanner.nextInt();

        double basePrice = 0.0;
        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid size selection.");
            return;
        }

        System.out.println("Would you like it loaded? (yes/no): ");
        String loadedInput = scanner.next();
        boolean isLoaded = loadedInput.equalsIgnoreCase("yes");

        if (isLoaded) {
            if (size == 1) {
                basePrice += 1.00;
            } else if (size == 2) {
                basePrice += 1.75;
            }
        }

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }

        double finalPrice = basePrice - (basePrice * discount);

        System.out.printf("Your total is: $%.2f\n", finalPrice);
    }
}