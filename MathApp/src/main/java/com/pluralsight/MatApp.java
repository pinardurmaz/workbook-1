package com.pluralsight;
  class MathApp {

     public static void main(String[] args) {

        // Question 1:
        // Determine the highest salary between Bob and Gary
        double bobSalary = 50000.0f;
        double garySalary = 60000.0f;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("Question 1: The highest salary is " + highestSalary);

        // Question 2:
        // Find the smallest of carPrice and truckPrice
        double carPrice = 25000.0;
        double truckPrice = 30000.0;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("Question 2: The smallest price is " + smallestPrice);

        // Question 3:
        // Find and display the area of a circle with radius 7.25
        double radius = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);  // Formula for area: πr^2
        System.out.println("Question 3: The area of the circle is " + areaOfCircle);

        // Question 4:
        // Find and display the square root of a number (5.0)
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("Question 4: The square root of " + number + " is " + squareRoot);

        // Question 5:
        // Find and display the distance between two points (5, 10) and (85, 50)
        double x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));  // Distance formula
        System.out.println("Question 5: The distance between the points is " + distance);

        // Question 6:
        // Find and display the absolute value of -3.8
        double negativeValue = -3.8;
        double absoluteValue = Math.abs(negativeValue);
        System.out.println("Question 6: The absolute value of " + negativeValue + " is " + absoluteValue);

        // Question 7:
        // Display a random number between 0 and 1
        double randomNumber = Math.random();
        System.out.println("Question 7: A random number between 0 and 1 is " + randomNumber);

    }
}
