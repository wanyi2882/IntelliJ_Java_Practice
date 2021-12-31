package com.company;
import java.util.*;

public class SortedNumbers {
        public static void main(String[] args) {
            // Write code here
            Scanner sc = new Scanner(System.in);

            int first = sc.nextInt();
            int second = sc.nextInt();
            int third = sc.nextInt();

            if (first < second && second < third){
                System.out.println("Ascending");
            }
            else if (first > second && second > third){
                System.out.println("Descending");
            }
            else {
                System.out.println("Not sorted");
            }
        }
}
