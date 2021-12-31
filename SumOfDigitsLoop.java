package com.company;
import java.util.*;

public class SumOfDigitsLoop {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        while(true){
            String input = sc.nextLine();

            if(input.equals("End")){
                break;
            }

            int sum = 0;
            int number = Integer.parseInt(input);

            for(int i = number; i > 0; i /= 10){
                sum += i % 10;
            }
            System.out.printf("Sum of digits = %d%n", sum);
        }

        System.out.println("Goodbye");
    }
}
