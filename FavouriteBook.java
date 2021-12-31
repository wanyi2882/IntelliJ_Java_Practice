package com.company;
import java.util.*;

public class FavouriteBook {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        String book = sc.nextLine();
        String checkBook = sc.nextLine();
        int count = 0;

        while(!book.equals(checkBook)){
            checkBook = sc.nextLine();
            count += 1;
            if(book.equals(checkBook)){
                break;
            }
        }
        System.out.printf("Book found! Attempts: %d", count);
    }
}
