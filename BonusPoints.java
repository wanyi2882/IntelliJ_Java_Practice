package com.company;
import java.util.*;

public class BonusPoints {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number >= 0 && number <= 3){
            System.out.printf("%d", number + 5);
        }
        else if(number >= 4 && number <= 6){
            System.out.printf("%d", number + 15);
        }
        else if(number >= 7 && number <= 9){
            System.out.printf("%d", number + 20);
        }
    }
}
