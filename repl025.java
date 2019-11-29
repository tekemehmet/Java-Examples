package replyStudy;

import java.util.Scanner;

public class repl025 {

    public static void main(String[] args) {

        /*using an if statement check which int is larger a or b, and then output:
        "number is greater".

        for example:
        a=1
        b=2

        output:
        2 is greater

        a=5
        b=7

        output:
        7 is greater

         */
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if ( a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }


    }
}
