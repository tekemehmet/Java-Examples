package replyStudy;

import java.util.Scanner;

public class repl064 {

    public static void main(String[] args) {

        //Write a program that will print out last letter of the word (string).
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int wordLength = word.length();
        System.out.println(word.charAt(wordLength-1));
    }
}
