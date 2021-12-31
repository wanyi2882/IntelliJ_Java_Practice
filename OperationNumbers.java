package com.company;
import java.util.*;

public class OperationNumbers {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        double first = Double.parseDouble(sc.nextLine());
        double second = Double.parseDouble(sc.nextLine());
        String operator = sc.nextLine();

        if(operator.equals("+")){
            System.out.printf("%.0f %s %.0f = %.2f", first, operator, second, first + second);
        }
        else if(operator.equals("-")){
            System.out.printf("%.0f %s %.0f = %.2f", first, operator, second, first - second);
        }
        else if(operator.equals("*")){
            System.out.printf("%.0f %s %.0f = %.2f", first, operator, second, first * second);
        }
        else if(operator.equals("/")){
            System.out.printf("%.0f %s %.0f = %.2f", first, operator, second, first / second);
        }
        else if(operator.equals("%")){
            System.out.printf("%.0f %s %.0f = %.2f", first, operator, second, first % second);
        }
    }
}
