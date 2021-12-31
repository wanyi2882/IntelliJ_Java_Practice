package com.company;
import java.util.*;

public class LatinLetter {

    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        char first = sc.nextLine().charAt(0);
        char second = sc.nextLine().charAt(0);

        for(char i = first; i <= second; i++){
            System.out.println(i);
        }
    }}
