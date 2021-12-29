package com.company;
import java.util.*;

public class TriangleArea {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double h = scanner.nextDouble();
        double area = (a * h) / 2;
        System.out.printf("%.2f", area);
    }
}
