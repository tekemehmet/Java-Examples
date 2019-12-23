package replyStudy;

import java.util.Scanner;

public class repl095 {
    public static void main(String[] args) {

        // Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.
        //Example:
        //input: A
        //input: Z
        //output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        while (start <= end) {
            System.out.print(start);
            ++start;

        }





    }
}
