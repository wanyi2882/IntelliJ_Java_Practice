package com.company;
import java.util.*;

public class PipesPool {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int P1 = sc.nextInt();
        int P2 = sc.nextInt();
        double H = sc.nextDouble();

        double currentVolume = (P1 + P2) * H;
        if (currentVolume <= V) {
            double P1Percentage = (P1*H)/V * 100;
            double P2Percentage = (P2*H)/V * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", currentVolume/V*100, P1Percentage, P2Percentage);
        }
        else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters", H, currentVolume - V);
        }
    }
}
