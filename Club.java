package com.company;
import java.util.*;

public class Club {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        //On the first line - the desired profit of the club - a real number in range
        double profit = Double.parseDouble(sc.nextLine());

        double currentAmount = 0;

        while(true){
            if(currentAmount >= profit){
                System.out.println("Target acquired.");
                System.out.printf("Club income - %.2f dollars.", currentAmount);
                break;
            }

            //The name of a cocktail - a string
            String cocktail = sc.nextLine();

            if(cocktail.equals("Party!")){
                System.out.printf("We need %.2f dollars more.%n", profit - currentAmount);
                System.out.printf("Club income - %.2f dollars.", currentAmount);
                break;
            }

            if(currentAmount < profit){
                //The number of times it is contained in the order - an integer
                int numberOfTimes = Integer.parseInt(sc.nextLine());

                if((cocktail.length()*numberOfTimes)%2 != 0){
                    currentAmount += (1 - 0.25) * cocktail.length() * numberOfTimes;
                }
                else{
                    currentAmount += cocktail.length() * numberOfTimes;
                }
            }
        }
    }
}
