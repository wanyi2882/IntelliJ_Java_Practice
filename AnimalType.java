package com.company;
import java.util.*;

public class AnimalType {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine();

        if (animal.equals("dog")){
            System.out.println("mammal");
        }
        else if (animal.equals("crocodile") || animal.equals("tortoise") || animal.equals("snake") ){
            System.out.println("reptile");
        }
        else {
            System.out.println("unknown");
        }
    }
}
