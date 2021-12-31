package com.company;
import java.util.*;

public class TvSeriesBudget {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int series = Integer.parseInt(sc.nextLine());
        double requiredAmount = 0;

        for(int i = 1; i <= series; i++){
            String title = sc.nextLine();
            double price = Double.parseDouble(sc.nextLine());

            if(title.equals("Thrones")){
                requiredAmount += price * (1-0.5);
            }
            else if(title.equals("Lucifer")){
                requiredAmount += price * (1-0.4);
            }
            else if(title.equals("Protector")){
                requiredAmount += price * (1-0.3);
            }
            else if(title.equals("TotalDrama")){
                requiredAmount += price * (1-0.2);
            }
            else if(title.equals("Area")){
                requiredAmount += price * (1-0.1);
            }
            else{
                requiredAmount += price;
            }
        }

        if(budget >= requiredAmount){
            System.out.printf("You bought all the series and left with %.2f$", budget-requiredAmount);
        }
        else{
            System.out.printf("You need %.2f$ more to buy the series!", requiredAmount - budget);
        }
    }
}
