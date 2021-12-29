package com.company;
import java.util.*;

public class DaysToMins {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int mins = days * 60 * 24;
        System.out.println(mins);
    }
}
