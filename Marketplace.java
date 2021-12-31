package com.company;
import java.util.*;

public class Marketplace {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        String dayOfWeek = sc.nextLine();

        if (product.equals("Banana")){
            if(dayOfWeek.equals("Weekday")){
                System.out.printf("%.2f", 2.50);
            }
            else{
                System.out.printf("%.2f", 2.70);
            }
        }
        else if (product.equals("Apple")){
            if(dayOfWeek.equals("Weekday")){
                System.out.printf("%.2f", 1.30);
            }
            else{
                System.out.printf("%.2f", 1.60);
            }
        }
        else if (product.equals("Kiwi")){
            if(dayOfWeek.equals("Weekday")){
                System.out.printf("%.2f", 2.20);
            }
            else{
                System.out.printf("%.2f", 3.00);
            }
        }
    }
}
