package com.company;
import java.util.*;

public class FoodOrDrink {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        if(word.equals("curry") || word.equals("noodles") || word.equals("sushi") || word.equals("spaghetti")){
            System.out.println("food");
        }
        else if(word.equals("tea") || word.equals("water") || word.equals("coffee")){
            System.out.println("drink");
        }
        else {
            System.out.println("unknown");
        }
    }
}
