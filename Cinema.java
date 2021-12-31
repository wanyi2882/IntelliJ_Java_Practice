package com.company;
import java.util.*;

public class Cinema {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String movie = sc.nextLine();
        String offer = sc.nextLine();
        int tickets = Integer.parseInt(sc.next());
        double price = 0;
        double starwarsDiscount = 0.3;
        double jumanjiDiscount = 0.15;

        if(movie.equals("John Wick")){
            if(offer.equals("Drink")){
                price = tickets * 12;
            }
            else if(offer.equals("Popcorn")){
                price = tickets * 15;
            }
            else if(offer.equals("Menu")){
                price = tickets * 19;
            }
        }
        else if(movie.equals("Star Wars")){
            if(offer.equals("Drink")){
                if(tickets >= 4){
                    price = tickets * (1 - starwarsDiscount) * 18;
                }
                else{
                    price = tickets * 18;
                }
            }
            else if(offer.equals("Popcorn")){
                if(tickets >= 4){
                    price = tickets * (1 - starwarsDiscount) * 25;
                }
                else{
                    price = tickets * 25;
                }
            }
            else if(offer.equals("Menu")){
                if(tickets >= 4){
                    price = tickets * (1 - starwarsDiscount) * 30;
                }
                else{
                    price = tickets * 30;
                }
            }
        }
        else if(movie.equals("Jumanji")){
            if(offer.equals("Drink")){
                if(tickets == 2){
                    price = tickets * (1 - jumanjiDiscount) * 9;
                }
                else{
                    price = tickets * 9;
                }
            }
            else if(offer.equals("Popcorn")){
                if(tickets == 2){
                    price = tickets * (1 - jumanjiDiscount) * 11;
                }
                else{
                    price = tickets * 11;
                }
            }
            else if(offer.equals("Menu")){
                if(tickets == 2){
                    price = tickets * (1 - jumanjiDiscount) * 14;
                }
                else{
                    price = tickets * 14;
                }
            }
        }
        System.out.printf("Your bill is %.2f$", price);
    }
}
