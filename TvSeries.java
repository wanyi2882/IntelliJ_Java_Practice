package com.company;
import java.util.*;

public class TvSeries {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        int season = Integer.parseInt(sc.nextLine());
        int episodes = Integer.parseInt(sc.nextLine());
        double eachEpisodeDuration = Double.parseDouble(sc.next());
        double withAdvertisement = 1.2 * eachEpisodeDuration;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", title, Math.ceil(season*(episodes*withAdvertisement+10)));
    }
}
