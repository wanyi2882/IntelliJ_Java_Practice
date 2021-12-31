package com.company;
import java.util.*;

public class TriangleStars {
    public static void main(String[] args) {
        // Place your code here
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
