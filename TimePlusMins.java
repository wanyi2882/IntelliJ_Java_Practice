package com.company;
import java.util.*;

public class TimePlusMins {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int mins = sc.nextInt();
        int newMins = mins + 15;

        if (newMins < 60) {
            System.out.printf("%d:%d", hours, newMins);
        }
        else {
            int updatedHours = hours + 1;
            int updatedMins = newMins - 60;
            if(updatedMins < 10){
                System.out.printf("%d:0%d", updatedHours, updatedMins);
            }
            else{
                System.out.printf("%d:%d", updatedHours, updatedMins);
            }
        }
    }
}
