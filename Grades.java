package com.company;
import java.util.*;

public class Grades {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int student = Integer.parseInt(sc.nextLine());
        double tierOne = 0;
        double tierTwo = 0;
        double tierThree = 0;
        double tierFour = 0;
        double totalGrade = 0;

        for(int i = 1; i <= student; i++){
            double grade = Double.parseDouble(sc.nextLine());
            totalGrade += grade;

            if(grade >= 2.00 && grade <= 2.99){
                tierOne += 1;
            }
            else if(grade >= 3.00 && grade <= 3.99){
                tierTwo += 1;
            }
            else if(grade >=4.00 && grade <= 4.99){
                tierThree += 1;
            }
            else if(grade >= 5.00){
                tierFour += 1;
            }
        }
        System.out.printf("Top students: %.2f %% %n", tierFour/student*100);
        System.out.printf("Between 4.00 and 4.99: %.2f %% %n", tierThree/student*100);
        System.out.printf("Between 3.00 and 3.99: %.2f %% %n", tierTwo/student*100);
        System.out.printf("Fail: %.2f %% %n", tierOne/student*100);
        System.out.printf("Average: %.2f", totalGrade/student);
    }
}
