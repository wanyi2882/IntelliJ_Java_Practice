package com.company;
import java.util.*;

public class Walking {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        String steps = sc.nextLine();
        int stepSum = 0;
        if(steps.equals("Going home")){
            stepSum += 0;
        }
        else{
            stepSum += Integer.parseInt(steps);
        }

        while(stepSum < 10000){
            steps = sc.nextLine();
            if(steps.equals("Going home")){
                stepSum += 0;
            }
            else{
                stepSum += Integer.parseInt(steps);
            }

            if(stepSum >= 10000){
                System.out.println("Goal reached! Good job!.");
                break;
            }

            else if(steps.equals("Going home")){
                steps = sc.nextLine();
                stepSum += Integer.parseInt(steps);
                System.out.printf("%d more steps to reach goal.", 10000 - stepSum);
                break;
            }
        }
    }
}
