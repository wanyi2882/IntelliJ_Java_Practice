package com.company;
import java.util.*;

public class CinemaIncome {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int capacity = Integer.parseInt(sc.nextLine());
        int remainingAvailability = capacity;
        int currentEntry = 0;
        int currentIncome = 0;

        while(true){
            String entry = sc.nextLine();

            if(entry.equals("Movie time!")){
                System.out.printf("There are %d seats left in the cinema.%n", remainingAvailability);
                System.out.printf("Cinema income - %d$", currentIncome);
                break;
            }
            else{
                int entryInt = Integer.parseInt(entry);

                if (entryInt <= remainingAvailability){
                    remainingAvailability -= entryInt;
                    currentEntry += entryInt;

                    if(entryInt % 3 == 0){
                        currentIncome += entryInt * 5 - 5;
                    }
                    else{
                        currentIncome += entryInt * 5;
                    }
                }

                else if(remainingAvailability < entryInt){
                    System.out.println("The cinema is full.");
                    System.out.printf("Cinema income - %d$", currentIncome);
                    break;
                }
            }
        }
    }
}
