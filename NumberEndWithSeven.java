package com.company;
import java.util.*;

public class NumberEndWithSeven {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for(int i = 7; i <= n; i+=10){
            System.out.println(i);
        }
    }
}
