package com.company;
import java.util.*;

public class WalkingEx2 {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        while (total < 10000){
            System.out.print("Enter number of steps walked: ");
            int steps = scanner.nextInt();
            total += steps;
            int stepsLeft = 10000 - total;
            if (stepsLeft <= 0){
                System.out.println("Goal reached! Good Job!");
            }
            else{
                System.out.printf( stepsLeft + " more steps to reach goal.\n");
            }
        }
    }
}
