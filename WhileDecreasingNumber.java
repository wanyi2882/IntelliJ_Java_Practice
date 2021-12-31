package com.company;
import java.util.*;

public class WhileDecreasingNumber {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        while(number >= 1){
            System.out.println(number);
            number--;
        }
    }
}
