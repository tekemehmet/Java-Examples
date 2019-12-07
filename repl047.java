package replyStudy;

import java.util.Scanner;

public class repl047 {

    public static void main(String[] args) {

        //   The variable "num" holds an integer user input
        //
        //Write a conditional statement starting on line 9 that does the following:
        //If num is even (divisible by 2), print "__ is even"
        //If num is odd, print "__ is odd"


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();

        if ( num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
