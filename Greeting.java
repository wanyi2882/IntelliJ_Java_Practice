package com.company;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write code here
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
