package com.company;
import java.util.*;

public class GuessThePassword {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.equals("s3cr3t!")) {
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }
    }
}
