package com.company;
import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for(int i = 1; i <= n; i++){
            int number = Integer.parseInt(sc.nextLine());

            if(number > maxValue){
                maxValue = number;
            }
            if(number < minValue){
                minValue = number;
            }
        }
        System.out.printf("Max number: %d%n", maxValue);
        System.out.printf("Min number: %d", minValue);
    }
}
