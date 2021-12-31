package com.company;
import java.util.*;

public class EvenPowerOfTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int current = 1;


        for(int i=0; i <= n; i+=2){
            if(i > 0){
                System.out.print(", ");
            }
            System.out.print(current * current);
            current = current + current;
        }
    }
}
