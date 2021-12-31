package com.company;
import java.util.*;

public class VacationExpense {
    public static void main(String[] args) {
        // Write code here
        Scanner sc = new Scanner(System.in);

        String season = sc.nextLine();
        String accom = sc.nextLine();
        int days = sc.nextInt();

        if(season.equals("Spring")){
            if(accom.equals("Hotel")){
                System.out.printf("%.2f", 30 * (1 - 0.2) * days);
            }
            else if (accom.equals("Camping")){
                System.out.printf("%.2f", 10 * (1 - 0.2) * days);
            }
        }
        else if(season.equals("Summer")){
            if(accom.equals("Hotel")){
                System.out.printf("%.2f", 50.00 * days);
            }
            else if (accom.equals("Camping")){
                System.out.printf("%.2f", 30.00 * days);
            }
        }
        else if(season.equals("Autumn")){
            if(accom.equals("Hotel")){
                System.out.printf("%.2f", 20 * (1 - 0.3) * days);
            }
            else if (accom.equals("Camping")){
                System.out.printf("%.2f", 15 * (1 - 0.3) * days);
            }
        }
        else if(season.equals("Winter")){
            if(accom.equals("Hotel")){
                System.out.printf("%.2f", 40 * (1 - 0.1) * days);
            }
            else if (accom.equals("Camping")){
                System.out.printf("%.2f", 10 * (1 - 0.1) * days);
            }
        }
    }
}
