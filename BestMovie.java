package com.company;
import java.util.*;

public class BestMovie {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String bestTitle = "";
        int bestTitlePoints = 0;
        int currentTitlePoints = 0;

        for(int i = 1; i <= 7; i++){
            String input = sc.nextLine();

            if(input.equals("STOP")){
                System.out.printf("The best movie for you is %s with %d ASCII sum.", bestTitle, bestTitlePoints);
                break;
            }
            else{
                for(int j = 0; j < input.length(); j++){
                    char character = input.charAt(j);
                    currentTitlePoints += (int) character;

                    if(Character.isUpperCase(character)){
                        currentTitlePoints -= input.length();
                    }
                    else if(Character.isLowerCase(character)){
                        currentTitlePoints -= 2 * input.length();
                    }
                }
            }

            if(currentTitlePoints > bestTitlePoints){
                bestTitlePoints = currentTitlePoints;
                bestTitle = input;
                currentTitlePoints = 0;
            }
            if (i == 7){
                System.out.println("The limit is reached.");
                System.out.printf("The best movie for you is %s with %d ASCII sum.", bestTitle, bestTitlePoints);
            }
        }
    }
}

