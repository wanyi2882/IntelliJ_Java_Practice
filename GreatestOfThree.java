package com.company;
import java.util.*;

public class GreatestOfThree {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        if(one > two && one > three) {
            System.out.println(one);
        }
        else if(two > one && two > three) {
            System.out.println(two);
        }
        else if(three > two && three > one) {
            System.out.println(three);
        }
    }
}
