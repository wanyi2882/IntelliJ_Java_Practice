package com.company;
import java.util.*;

public class WordsWar {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int highestCount = 0;
        int currentWordSum = 0;
        String winnerWord = "";

        while(true){
            String input = sc.nextLine();

            if(input.equals("STOP")){
                System.out.printf("Winner is %s - %d!", winnerWord, highestCount);
                break;
            }

            for(int i = 0; i <input.length(); i++){
                currentWordSum += (int) input.charAt(i);
            }

            if(currentWordSum > highestCount){
                highestCount = currentWordSum;
                currentWordSum = 0;
                winnerWord = input;
            }
            else{
                currentWordSum = 0;
            }
        }
    }
}
