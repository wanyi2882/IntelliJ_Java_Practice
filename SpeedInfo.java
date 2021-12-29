package com.company;
import java.util.*;

public class SpeedInfo {

    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);
        double speed = sc.nextDouble();
        if(speed <= 30){
            System.out.println("Slow");
        }
        else if(speed > 30){
            System.out.println("Fast");
        }
    }}
