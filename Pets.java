package com.company;
import java.util.*;

public class Pets {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        int food = sc.nextInt();
        double dogFood = sc.nextDouble();
        double catFood = sc.nextDouble();
        double turtleFood = sc.nextDouble();
        double total = dogFood + catFood + turtleFood/1000;

        if (food >= total * days) {
            System.out.printf("%.0f kilos of food left.", Math.floor(food - (total * days)));
        } else if (food < total * days) {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil((total * days) - food));
        }
    }
}
