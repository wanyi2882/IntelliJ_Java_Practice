package com.company;
import java.util.*;

public class CoffeeShop {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);
        String drink = sc.nextLine();
        String sugar = sc.nextLine();
        double price = 0;
        if(drink.equals("coffee")){
            price += 1.00;
            if(sugar.equals("sugar")){
                price += 0.40;
                System.out.printf("Final price: $%.2f", price);
            }
            else if(sugar.equals("no")){
                System.out.printf("Final price: $%.2f", price);
            }
        }
        else if(drink.equals("tea")){
            price += 0.60;
            if(sugar.equals("sugar")){
                price += 0.40;
                System.out.printf("Final price: $%.2f", price);
            }
            else if(sugar.equals("no")){
                System.out.printf("Final price: $%.2f", price);
            }
        }
    }
}
