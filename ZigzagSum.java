package com.company;
import java.util.*;

public class ZigzagSum {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int evenSum = 0;
        int oddSubtract = 0;

        for(int i = 1; i <= n; i++){
            int number = Integer.parseInt(sc.nextLine());

            if(i%2==0){
                evenSum += number;
            }
            else{
                oddSubtract -= number;
            }
        }
        System.out.println(evenSum + oddSubtract);
    }
}
