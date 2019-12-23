package replyStudy;

import java.util.Scanner;

public class repl096 {

    public static void main(String[] args) {

        // Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
        // separated by the separator string.
        //Example:
        //input: Word
        //input: X
        //input: 3
        //output: WordXWordXWord


        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();


        String name = "";
        for (int i = 1; i <= count; i++) {

            name =  name +word + separator ;

            if (i == count) {

                System.out.print(name.substring(0, name.length()-separator.length() ));
            } else {
                continue;
            }

        }
    }
}