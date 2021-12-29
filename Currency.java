package com.company;
import java.util.*;

public class Currency {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        double dollars = scanner.nextDouble();
        double euro = dollars * 0.88;
        System.out.printf("%.2f", euro);
    }
}
