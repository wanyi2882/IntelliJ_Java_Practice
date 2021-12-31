package com.company;
import java.util.*;

public class SumDigits {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int sum = 0;

        while(number > 0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
