package com.company;
import java.util.*;

public class VowelOrConsonant {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        String letter = sc.nextLine();

        switch (letter) {
            case "a":
            case "A":
            case "e":
            case "E":
            case "i":
            case "I":
            case "o":
            case "O":
            case "u":
            case "U":
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");
                break;
        }
    }
}
