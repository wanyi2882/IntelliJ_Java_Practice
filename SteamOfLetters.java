package com.company;
import java.util.*;

public class SteamOfLetters {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        String letter = sc.nextLine();
        String newString = "";
        int cCount = 0;
        int oCount = 0;
        int nCount = 0;

        while(!letter.equals("end")){

            if(letter.equals("c")){
                cCount += 1;
                letter = sc.nextLine();
            }

            else if(letter.equals("o")){
                oCount += 1;
                letter = sc.nextLine();
            }
            else if(letter.equals("n")){
                nCount += 1;
                letter = sc.nextLine();
            }
            else if(letter.equals("!") || letter.equals("@")
                    || letter.equals("#") ||  letter.equals("$")
                    || letter.equals("%") || letter.equals("^") || letter.equals("*")){
                letter = sc.nextLine();
            }
            else if(cCount >=1 && oCount >=1 && nCount >= 1){
                newString += " ";
                cCount = 0;
                oCount = 0;
                nCount = 0;
            }

            else{
                newString += letter;
                letter = sc.nextLine();
            }

            if(letter.equals("end")){
                System.out.println(newString);
                break;
            }
        }
    }
}
