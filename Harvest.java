package com.company;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Harvest {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        double yield = sc.nextDouble();
        double ActualProduction = size * yield / 2.5 * 0.4;

        int goal = sc.nextInt();
        double productionGoal = goal;
        int workers = sc.nextInt();

        if (ActualProduction < productionGoal) {
            int shortfall = (int) (productionGoal - ActualProduction);
            System.out.printf("It will be a tough winter! %d liters of wine needed to reach the goal.", shortfall);
        }
        else if(ActualProduction > productionGoal) {
            int actual = (int) ActualProduction;
            int extra = (int) (ActualProduction - productionGoal);
            int eachWorker = extra / workers;
            System.out.printf("Good harvest this year! Total wine: %d liters.", actual);
            System.out.printf("%d liters left -> %d liters per person.", extra, eachWorker);
        }
    }
}
