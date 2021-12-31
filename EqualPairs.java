package com.company;
import java.util.*;

public class EqualPairs {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int prevSum = 0;
        int maxDiff = 0;

        for(int i = 0; i < n; i++){
            int first = Integer.parseInt(sc.nextLine());
            int second = Integer.parseInt(sc.nextLine());
            int sum = first + second;

            if(i > 0){
                int diff = Math.abs(sum - prevSum);
                if(diff > maxDiff){
                    maxDiff = diff;
                }
                else if (diff == maxDiff){
                    maxDiff = 0;
                }
            }
            prevSum = sum;
        }

        if(maxDiff == 0){
            System.out.printf("Yes, value=%d", prevSum);
        }
        else{
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
