package com.company;
import java.util.*;

public class PersonInfo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String country = sc.nextLine();
        String town = sc.nextLine();

        System.out.printf("%s %s from %s - %s!", firstName, lastName, country, town);
    }
}
