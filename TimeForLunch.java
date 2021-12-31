package com.company;
import java.util.*;

public class TimeForLunch {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String series = sc.nextLine();
        int duration = Integer.parseInt(sc.nextLine());
        int breakDuration = Integer.parseInt(sc.nextLine());
        double availableTime = (1-0.125-0.25)*breakDuration;

        if(duration <= availableTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series, Math.ceil(availableTime - duration));
        }
        else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series, Math.ceil(duration - availableTime));
        }
    }
}
