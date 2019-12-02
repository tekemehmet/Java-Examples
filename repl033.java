package replyStudy;

import java.util.Scanner;

public class repl033 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");

        int milligram = scan.nextInt();
        int shot = 10000/milligram;

        System.out.println("It would take about " + shot + " drinks for a lethal overdose.");

    }
}
