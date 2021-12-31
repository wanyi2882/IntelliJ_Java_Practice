package com.company;
import java.util.*;

public class Passwords {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int first = 2; first <= n ; first+=2){
            for(int second = 1; second <= n; second+=2){
                System.out.print(first + "" + second + "" + (first*second) + " ");
            }
        }
    }
}
