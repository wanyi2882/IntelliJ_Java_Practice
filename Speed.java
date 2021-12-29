package com.company;
import java.util.*;

public class Speed {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        double time = scanner.nextDouble();
        double speed = distance / time;
        System.out.printf("%.2f", speed);
    }
}
