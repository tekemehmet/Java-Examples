package replyStudy;

import java.util.Scanner;

public class repl068 {

    public static void main(String[] args) {

        //Write a program that will verify if word contains in the sentence. Print out the result as boolean value.
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        System.out.println(sentence.contains(word));
    }
}
