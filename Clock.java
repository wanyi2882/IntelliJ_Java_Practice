package com.company;
import java.util.*;

public class Clock {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        for(int i = hours; i<=23; i++){
            for(int j = minutes; j<=59; j++){
                if(i<10){
                    if(j<10){
                        System.out.printf("0%d : 0%d%n", i, j);
                    }
                    else{
                        System.out.printf("0%d : %d%n", i, j);
                    }
                }
                else if(i>=10){
                    if(j<10){
                        System.out.printf("%d : 0%d%n", i, j);
                    }
                    else{
                        System.out.printf("%d : %d%n", i, j);
                    }
                }
            }

            for(int k = 0; k < minutes - 0; k++){
                if(i<9){
                    if(k<10){
                        System.out.printf("0%d : 0%d%n", i+1, k);
                    }
                    else{
                        System.out.printf("0%d : %d%n", i+1, k);
                    }
                }
                else if(i>=9 && i<=22){
                    if(k<10){
                        System.out.printf("%d : 0%d%n", i+1, k);
                    }
                    else{
                        System.out.printf("%d : %d%n", i+1, k);
                    }
                }
            }
        }
    }
}
