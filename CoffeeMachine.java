package com.company;
import java.util.*;

public class CoffeeMachine {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        String drink = sc.nextLine();
        // The first line describes the type of drink - a string: "Espresso", "Cappuccino" or "Tea"

        String sugarLevel = sc.nextLine();
        // The second line represents the sugar level - a string: "Without", "Normal" or "Extra"

        int numberOfDrinks = Integer.parseInt(sc.nextLine());
        // The third line will specify the number of drinks

        double cost = 0;

        if(drink.equals("Espresso")){
            if(sugarLevel.equals("Without")){
                if(numberOfDrinks >= 5){
                    cost += (1-0.25)*((1-0.35) * numberOfDrinks * 0.9);
                }
                else{
                    cost += (1-0.35) * numberOfDrinks * 0.9;
                }
            }
            else if(sugarLevel.equals("Normal")){
                if(numberOfDrinks >= 5){
                    cost += (1-0.25)*(numberOfDrinks * 1);
                }
                else{
                    cost += numberOfDrinks * 1;
                }
            }
            else if(sugarLevel.equals("Extra")){
                if(numberOfDrinks >= 5){
                    cost += (1-0.25)*(numberOfDrinks * 1.2);
                }
                else{
                    cost += numberOfDrinks * 1.2;
                }
            }
        }
        else if(drink.equals("Cappuccino")){
            if(sugarLevel.equals("Without")){
                cost += (1-0.35)*numberOfDrinks*1;

            }
            else if(sugarLevel.equals("Normal")){
                cost += numberOfDrinks*1.2;
            }
            else if(sugarLevel.equals("Extra")){
                cost += numberOfDrinks*1.6;
            }
        }
        else if(drink.equals("Tea")){
            if(sugarLevel.equals("Without")){
                cost += (1-0.35)*numberOfDrinks*0.5;

            }
            else if(sugarLevel.equals("Normal")){
                cost += numberOfDrinks*0.6;
            }
            else if(sugarLevel.equals("Extra")){
                cost += numberOfDrinks*0.7;
            }
        }

        if(cost > 15){
            cost = cost * (1-0.2);
        }

        System.out.printf("You bought %d cups of %s for %.2f dollars.", numberOfDrinks, drink, cost);
    }
}
