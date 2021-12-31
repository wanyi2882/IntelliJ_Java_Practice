package com.company;
import java.util.*;

public class Christmas {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        //The number of days the tournament will be running for is an integer in range
        int days = Integer.parseInt(sc.nextLine());

        double totalWinnings = 0;
        int eachDayWinnings = 0;
        int wonGames = 0;
        int lostGames = 0;
        int wonDays = 0;
        int lostDays = 0;

        for(int i = 1; i <= days; i++){
            while(true){
                //Until you receive the "Finish" command, read: Game name - a string
                String gameName = sc.nextLine();

                if(gameName.equals("Finish")){
                    break;
                }

                //For each game read: Result - a string, options: "win" or "lose"
                String Result = sc.nextLine();

                if(Result.equals("win")){
                    eachDayWinnings += 20;
                    wonGames++;
                } else if(Result.equals("lose")){
                    lostGames++;
                }
            }
            if(wonGames > lostGames){
                totalWinnings += eachDayWinnings * 1.1;
                wonDays++;
                eachDayWinnings = 0;
                wonGames = 0;
                lostGames = 0;
            }
            else{
                totalWinnings += eachDayWinnings;
                lostDays++;
                eachDayWinnings = 0;
                wonGames = 0;
                lostGames = 0;
            }
        }

        if(wonDays > lostDays){
            System.out.printf("You won the tournament! Total money raised: %.2f", totalWinnings * 1.2);
        }
        else{
            System.out.printf("You lost the tournament! Total money raised: %.2f", totalWinnings);
        }
    }
}
