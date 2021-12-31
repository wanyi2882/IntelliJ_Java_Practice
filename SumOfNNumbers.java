package com.company;
import java.util.*;

public class SumOfNNumbers {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;

        for(int i = 1; i <= n; i++){
            System.out.println(i);
            sum += i;
        }

        System.out.println(sum);
    }
}
