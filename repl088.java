package replyStudy;

import java.util.Scanner;

public class repl088 {
    public static void main(String[] args) {

        // Print true if the string "cat" and "dog" appear the same number of times in the given string word.
        //Example:
        //input: catdog
        //output: true
        //
        //Example:
        //input: catcat
        //output: false
        //
        //Example:
        //input: cat-cheetah-dog-cat
        //output: false

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        int wordLength = word.length();

        for (int x = 0; x <= wordLength-3; x++) {

            String currentWord = word.substring(x,x+3);
            if(currentWord.equals("cat")){
                countOfCats++;
            } else if ( currentWord.equals("dog")){
                countOfDogs++;
            }

        }
        if (countOfCats == countOfDogs) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }




    }


}
