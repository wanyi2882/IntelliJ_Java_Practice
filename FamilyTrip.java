package com.company;
import java.util.*;

public class FamilyTrip {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int nights = Integer.parseInt(sc.nextLine());
        double pricePerNight = Double.parseDouble(sc.nextLine());
        int additionalCostPercentage = Integer.parseInt(sc.nextLine());
        double cost = 0;

        if (nights <= 7){
            cost += nights * pricePerNight;
            double decimal = (double) additionalCostPercentage/100;
            cost += decimal * budget;
        }

        else if(nights > 7){
            cost += nights * pricePerNight * (1 - 0.05);
            double decimal = (double) additionalCostPercentage/100;
            cost += decimal * budget;
        }

        if(budget >= cost){
            System.out.printf("The Smiths will be left with %.2f dollars after the vacation.", budget - cost);
        }
        else {
            System.out.printf("%.2f dollars needed.", cost - budget);
        }
    }
}
