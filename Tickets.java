package com.company;
import java.util.*;

public class Tickets {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);
        String ticket = sc.nextLine();
        double student = 1.00 ;
        double regular = 1.60 ;
        if(ticket.equals("student")){
            System.out.printf("$ %.2f", student);
        }
        else if (ticket.equals("regular")){
            System.out.printf("$ %.2f", regular);
        }
        else {
            System.out.println("Invalid ticket type!");
        }
    }
}
