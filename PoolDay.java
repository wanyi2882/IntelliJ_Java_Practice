package com.company;
import java.util.*;

public class PoolDay {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        double entranceFee = Double.parseDouble(sc.nextLine());
        double sunbed = Double.parseDouble(sc.nextLine());
        double umbrella = Double.parseDouble(sc.nextLine());

        double cost = 0;

        cost += people * entranceFee;

        if(people % 2 == 0){
            cost += (people / 2) * umbrella;
        }
        else{
            cost += (people / 2 + 1) * umbrella;
        }

        cost += Math.ceil((0.75 * people)) * sunbed;

        System.out.printf("%.2f euro", cost);
    }
}
