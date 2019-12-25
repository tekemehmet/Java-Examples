package replyStudy;

import java.util.Scanner;

public class repl097 {
    public static void main(String[] args) {

        // Return the number of times that the string "java" appears anywhere in the given string word.
        //
        //Example:
        //input: javaxjava
        //output: 2
        //
        //Example:
        //input: javaxjavaapplepearjavaegg
        //output: 3

        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int count = 0;

        for (int x = 0; x < word.length()-3; x++) {

            if(word.substring(x, x + 4).equals("java") ){
                count++;

            }
        }
        System.out.println(count);


    }
}
