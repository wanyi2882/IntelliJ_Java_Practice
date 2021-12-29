package com.company;
import java.util.*;

public class Temperature {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        if(temperature > 100){
            System.out.println("The water is boiling");
        }
        else{
            System.out.println("The water is not hot enough");
        }
    }
}
