package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);

        System.out.print("Enter the first number");
        double firstNumber = calculator.nextDouble();

        System.out.print("Enter the second number");
        double secondNumber = calculator.nextDouble();

        System.out.println();


        System.out.println("possible calculations");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        String operation = calculator.next();
        System.out.println();
        double result = firstNumber * secondNumber;
        System.out.println(firstNumber + "*" + secondNumber + " = " + result);
    }
}