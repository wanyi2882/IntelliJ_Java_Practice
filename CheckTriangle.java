package com.company;
import java.util.*;

public class CheckTriangle {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);
        int sideOne = sc.nextInt();
        int sideTwo = sc.nextInt();
        int sideThree = sc.nextInt();
        if ((sideOne < sideTwo + sideThree) && (sideTwo < sideOne + sideThree) && (sideThree < sideTwo + sideTwo) ){
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("Invalid Triangle");
        }
    }
}
