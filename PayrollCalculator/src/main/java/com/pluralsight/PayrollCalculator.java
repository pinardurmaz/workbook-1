package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner salary = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = salary.nextLine();

        System.out.print("Please enter your hours worked: ");
        float hours = salary.nextFloat();

        System.out.print("Please enter your pay rate: ");
        float payRate = salary.nextFloat();

        System.out.println("Employee Name: " + name + ", Pay Rate: " + payRate * hours);
    }
}