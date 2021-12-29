package com.company;
import java.util.*;

public class FourOperations {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        double numberOne = scanner.nextDouble();
        double numberTwo = scanner.nextDouble();

        double sum = numberOne + numberTwo;
        double minus = numberOne - numberTwo;
        double multiple = numberOne * numberTwo;
        double divide = numberOne / numberTwo;

        System.out.printf("%.2f + %.2f = %.2f%n", numberOne, numberTwo, sum);
        System.out.printf("%.2f - %.2f = %.2f%n", numberOne, numberTwo, minus);
        System.out.printf("%.2f * %.2f = %.2f%n", numberOne, numberTwo, multiple);
        System.out.printf("%.2f / %.2f = %.2f%n", numberOne, numberTwo, divide);
    }
}
