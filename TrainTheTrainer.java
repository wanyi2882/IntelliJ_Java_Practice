package com.company;
import java.util.*;

public class TrainTheTrainer {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        int member = Integer.parseInt(sc.nextLine());
        int topicCount = 0;
        double totalForAllTopics = 0;

        while(true){
            String topic = sc.nextLine();
            double totalForOneTopic = 0;

            if(topic.equals("Finish")){
                System.out.printf("Student's final assessment is %.2f.", totalForAllTopics/(topicCount*member));
                break;
            }

            for(int i = 0; i < member; i++){
                double grade = Double.parseDouble(sc.nextLine());
                totalForOneTopic += grade;
                totalForAllTopics += grade;
            }
            topicCount++;
            System.out.printf("%s - %.2f.%n", topic, totalForOneTopic/member);
        }
    }
}
