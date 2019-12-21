package replyStudy;

import java.util.Scanner;

public class repl087 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int day = 0;

        while (inhabitants>0) {

            inhabitants=inhabitants;
            System.out.println("Day " + (day) + " ["+ inhabitants +"]");
            inhabitants/=2;
            day++;

          // System.out.println("Day " + (day) + " ["+ inhabitants +"]");

        }
        System.out.println("---- EXTINCT ----");



    }
}