package com.company;
import java.util.*;

public class FigureArea {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        if(figure.equals("square")){
            double number = sc.nextDouble();
            double area = number * number;
            System.out.println(area);
        }
        else if (figure.equals("rectangle")){
            double height = sc.nextDouble();
            double width = sc.nextDouble();
            double area = height * width;
            System.out.println(area);
        }
        else if(figure.equals("circle")){
            double radius = sc.nextDouble();
            double area = radius * radius * Math.PI;
            System.out.printf("%.2f",area);
        }
        else {
            System.out.println("Unknown figure");
        }
    }
}
