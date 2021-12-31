package com.company;
import java.util.*;

public class GreatestValue {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int maxValue = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++){
            int number = Integer.parseInt(sc.nextLine());

            if(number > maxValue){
                maxValue = number;
            }
        }
        System.out.println(maxValue);
    }
}
