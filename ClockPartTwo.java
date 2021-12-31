package com.company;
import java.util.*;

public class ClockPartTwo {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();

        while(seconds <= 60){
            if(hours == 23 && minutes == 59 && seconds == 59){
                System.out.printf("%d : %d : %d %n", hours, minutes, seconds);
                break;
            }
            if(hours < 10){
                // minutes less than 10
                if(minutes < 10){
                    if(seconds < 10){
                        System.out.printf("0%d : 0%d : 0%d %n", hours, minutes, seconds);
                        seconds++;
                    }
                    else{
                        System.out.printf("0%d : 0%d : %d %n", hours, minutes, seconds);
                        if(seconds == 59){
                            seconds = 0;
                            minutes++;
                        }
                        else{
                            seconds++;
                        }
                    }
                }
                // minutes more than 10
                else if(minutes < 59){
                    if(seconds < 10){
                        System.out.printf("0%d : %d : 0%d %n", hours, minutes, seconds);
                        seconds++;
                    }
                    else{
                        System.out.printf("0%d : %d : %d %n", hours, minutes, seconds);
                        if(seconds == 59){
                            seconds = 0;
                            minutes++;
                        }
                        else{
                            seconds++;
                        }
                    }
                }
                else if(minutes == 59){
                    if(seconds < 59){
                        System.out.printf("0%d : %d : 0%d %n", hours, minutes, seconds);
                        seconds++;
                    }
                    else if(seconds ==59){
                        System.out.printf("0%d : %d : %d %n", hours, minutes, seconds);
                        hours++;
                        minutes = 0;
                        seconds = 0;
                    }
                }
            }
            else if(hours >=10){
                // minutes less than 10
                if(minutes < 10){
                    if(seconds < 10){
                        System.out.printf("%d : 0%d : 0%d %n", hours, minutes, seconds);
                        seconds++;
                    }
                    else{
                        System.out.printf("%d : 0%d : %d %n", hours, minutes, seconds);
                        if(seconds == 59){
                            seconds = 0;
                            minutes++;
                        }
                        else{
                            seconds++;
                        }
                    }
                }
                // minutes more than 10
                else if(minutes < 59){
                    if(seconds < 10){
                        System.out.printf("%d : %d : 0%d %n", hours, minutes, seconds);
                        seconds++;
                    }
                    else{
                        System.out.printf("%d : %d : %d %n", hours, minutes, seconds);
                        if(seconds == 59){
                            seconds = 0;
                            minutes++;
                        }
                        else{
                            seconds++;
                        }
                    }
                }
                else if(minutes == 59){
                    if(seconds < 10){
                        System.out.printf("%d : %d : 0%d %n", hours, minutes, seconds);
                        seconds++;
                    }
                    else if(seconds < 59){
                        System.out.printf("%d : %d : %d %n", hours, minutes, seconds);
                        seconds++;
                    }
                    else if(seconds == 59){
                        System.out.printf("%d : %d : %d %n", hours, minutes, seconds);
                        hours++;
                        minutes = 0;
                        seconds = 0;
                    }
                }
            }
        }
    }
}
