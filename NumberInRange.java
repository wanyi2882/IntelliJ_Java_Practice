package com.company;
import java.util.*;

public class NumberInRange {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        while(number < 1 || number > 100){
            number = Integer.parseInt(sc.nextLine());
        }
        System.out.println(number);
    }
}
