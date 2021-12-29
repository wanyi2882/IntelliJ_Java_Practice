package com.company;
import java.util.*;

public class ProjectCreation {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int project = sc.nextInt();
        int hours = project * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours, project);
    }
}
