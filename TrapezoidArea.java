package com.company;
import java.util.*;

public class TrapezoidArea {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        double b1 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double h = sc.nextDouble();
        double area = ((b1 + b2) / 2) * h;
        System.out.println(area);
    }
}
