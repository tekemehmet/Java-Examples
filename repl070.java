package replyStudy;

import java.util.Scanner;

public class repl070 {

    // Print the longest word

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        int lengthWord1 = word1.length();
        int lengthWord2 = word2.length();

        if (lengthWord1 > lengthWord2) {
            System.out.println(word1);
        } else {
            System.out.println(word2);
        }

    }
}
