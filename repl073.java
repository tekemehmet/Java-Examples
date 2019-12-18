package replyStudy;

import java.util.Scanner;

public class repl073 {

    public static void main(String[] args) {

        // You have a word, do the following:
        //
        //If the word has odd number of characters
        //and has 5 or more characters, print the middle three
        //characters of the word.
        //
        //Otherwise print "invalid".
        //
        //fifteen ==> fte
        //apple ==> ppl
        //hey ==> invalid
        //java ==> invalid
        //whatsup ==> ats
        //$ ==> invalid

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char firstChar = word.charAt(0);

        int lengthOfWord = word.length();

        if ( lengthOfWord %2 != 0 && firstChar !='$' && lengthOfWord>3) {
            int middleIndex = lengthOfWord /2 ;
            System.out.println( word.substring(middleIndex-1,middleIndex+2));

        } else {
            System.out.println("invalid");
        }

    }
}
