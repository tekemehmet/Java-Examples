package replyStudy;

import java.util.Arrays;
import java.util.Scanner;

public class repl170 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }


        int count = 0;
        System.out.println("Day " + count + " " + Arrays.toString(inhabitants));

        for (int j = 1; j < inhabitants.length-1; j++) {
            while (inhabitants[j] != 0) {
                for (int k = j; k < inhabitants.length-1; k++) {
                    if (inhabitants[j]== 0) {
                        inhabitants[j - 1] /= 2;
                        inhabitants[j + 1] /= 2;
                    }
                }
                System.out.println("Day " + ++count + " " + Arrays.toString(inhabitants));
            }

        }
        System.out.println("---- EXTINCT ----");


    }
}
