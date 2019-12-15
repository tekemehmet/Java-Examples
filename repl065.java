package replyStudy;

import java.util.Scanner;

public class repl065 {

    public static void main(String[] args) {

       //You have 2 words
        //Print the first word, second word, second word, first word

        //Input:
        //one
        //two
        //Output:
        //onetwotwoone

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        System.out.println(word1+word2+word2+word1);
    }
}
