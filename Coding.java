package com.company;
import  java.util.*;

public class Coding {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int lengthOfN = Integer.toString(N).length();

        for(int i = lengthOfN - 1; i >= 0; i--){
            int current = N%10;
            if(current == 0){
                System.out.println("ZERO");
                N /= 10;
            }
            else{
                for(int j = 0; j < current; j++){
                    char character = (char) (current + 33);
                    System.out.print(character);
                }
                System.out.println();
                N /= 10;
            }
        }
    }
}
