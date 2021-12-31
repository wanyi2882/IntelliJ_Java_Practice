package com.company;
import java.util.*;

public class TriangleStarsWhileLoop {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int row = 1;

        while(row <= height){
            int col = 0;
            while(col++ < row){
                System.out.print("*");
            }
            System.out.println();
            row++;
        }
    }
}
