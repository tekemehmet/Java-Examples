package replyStudy;

import java.util.Scanner;

public class repl089 {

    public static void main(String[] args) {

        //Write a program that will print out first and last letters together.

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length()-1);
        System.out.println(""+ firstChar+lastChar);


    }
}
