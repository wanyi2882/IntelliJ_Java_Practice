package com.company;
import java.util.*;

public class VowelSum {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for(int i = 0; i < n; i++){
            char vowel = sc.nextLine().charAt(0);

            switch(vowel){
                case 'a':
                    sum += 1;
                    break;

                case 'e':
                    sum +=2;
                    break;

                case 'i':
                    sum += 3;
                    break;

                case 'o':
                    sum += 4;
                    break;

                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
