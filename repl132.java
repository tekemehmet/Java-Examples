package replyStudy;


import java.util.*;

public class repl132 {

    public static void main(String[] args) {

        // In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.
        //The highest and lowest scores are thrown out, and the remaining scores are added together.
        // The sum is then multiplied by the degree of difficulty for that dive.
        //The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.
        //Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.
        //output: Enter score for judge 1:
        //input: 1
        //output: Enter score for judge 2:
        //input: 5
        //output: Enter score for judge 3:
        //input: 5
        //output: Enter score for judge 4:
        //input: 5
        //output: Enter score for judge 5:
        //input: 5
        //output: Enter score for judge 6:
        //input: 8
        //output: Enter score for judge 7:
        //input: 9
        //output: Enter difficulty:
        //input: 2.1
        //output: Total: 35.28

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Enter score for judge " + (i+1)+":");
            score[i] = input.nextFloat();
        }
        System.out.println("Enter difficulty:");
        float diff = input.nextFloat();


        Arrays.sort(score);

        float total = 0;
        for (int i = 1; i < score.length-1; i++) {
            total += score[i];
        }

        total = total*diff* 0.6f;



       System.out.printf("Total: %.2f", total);
    }
}
