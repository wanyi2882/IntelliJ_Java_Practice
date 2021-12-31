package com.company;
import java.util.*;

public class ComplexOneToNStepOfThree {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i+=3){
            if(i > 1){
                System.out.print(", ");
            }
            System.out.print(i);
        }
    }
}
