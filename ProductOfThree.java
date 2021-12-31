package com.company;
import java.util.*;

public class ProductOfThree {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        double first = sc.nextDouble();
        double second = sc.nextDouble();
        double third = sc.nextDouble();

        if (first == 0 || second == 0 || third == 0) {
            System.out.println("zero");
        }
        else {
            int negativeCount = 0;
            if (first < 0){
                negativeCount++;
            }
            if (second < 0){
                negativeCount++;
            }
            if (third < 0){
                negativeCount++;
            }

            if(negativeCount % 2 == 0){
                System.out.println("positive");
            }
            else{
                System.out.println("negative");
            }
        }
    }
}
