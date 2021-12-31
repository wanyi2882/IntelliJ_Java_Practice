package com.company;
import java.util.*;

public class ExamCountdown {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = n; i >= 1; i--){
            System.out.printf("%d days before the exam%n", i);
        }
        System.out.println("The exam has come");
    }
}
