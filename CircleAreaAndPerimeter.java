package com.company;
import java.util.*;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = radius * radius * Math.PI;
        double perimeter = 2 * Math.PI * radius;
        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Perimeter = %.2f", perimeter);
    }
}
