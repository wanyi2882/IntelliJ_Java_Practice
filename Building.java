package com.company;
import java.util.*;

public class Building {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int floors = sc.nextInt();
        int rooms = sc.nextInt();

        for(int i = floors; i >= 1; i--){
            for( int r = 0; r < rooms; r++){
                if(i == floors){
                    System.out.print("L"+i+r+" ");
                }
                else if(i % 2 == 0){
                    System.out.print("O"+i+r+" ");
                }
                else {
                    System.out.print("A"+i+r+" ");
                }
            }
            System.out.println();
        }
    }
}
