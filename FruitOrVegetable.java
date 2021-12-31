package com.company;
import java.util.*;

public class FruitOrVegetable {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine();

        switch (value) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;

            case "cucumber":
            case "pepper":
            case "carrot":
            case "onion":
                System.out.println("vegetable");
                break;

            default:
                System.out.println("unknown");
                break;
        }
    }
}
