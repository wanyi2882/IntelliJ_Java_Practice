package com.company;
import java.util.*;

public class MagicNumber {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for(int i=1; i<=number; i++){
            for(int j=1; j<=number; j++){
                for(int k=1; k<=number; k++){
                    if(i*j*k == number){
                        System.out.printf("%d%d%d%n", i, j, k);
                    }
                }
            }
        }
    }
}
