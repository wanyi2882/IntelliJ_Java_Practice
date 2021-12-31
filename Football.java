package com.company;
import java.util.*;

public class Football {
    public static void main(String[] args) {
        // Write code here

        Scanner sc = new Scanner(System.in);

        //The name of the football team - a string
        String teamName = sc.nextLine();

        //The number of games, played during the season - an integer
        int numberOfGames = Integer.parseInt(sc.nextLine());

        int wins = 0;
        int loses = 0;
        int draws = 0;
        int points = 0;

        for(int i = 1; i <= numberOfGames; i++){
            String result = sc.nextLine();

            if(result.equals("W")){
                wins++;
                points += 3;
            }
            else if(result.equals("L")){
                loses++;
            }
            else if(result.equals("D")){
                draws++;
                points += 1;
            }
        }

        if(numberOfGames == 0){
            System.out.printf("%s hasn't played any games during this season.", teamName);
        } else{
            double winRate = (double) wins/numberOfGames;
            System.out.printf("%s has won %d points during this season.%n", teamName, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", wins);
            System.out.printf("## D: %d%n", draws);
            System.out.printf("## L: %d%n", loses);
            System.out.printf("Win rate: %.2f%%", winRate * 100);
        }
    }
}
