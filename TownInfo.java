package com.company;
import java.util.*;

public class TownInfo {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int population = sc.nextInt();
        int area = sc.nextInt();

        System.out.printf("Town %s has population of %d and area %d square km.", name, population, area);
    }
}
