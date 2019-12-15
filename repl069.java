package replyStudy;

import java.util.Scanner;

public class repl069 {

    public static void main(String[] args) {

        // Write a program that will print out first half of the word twice

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int wordLength = word.length();
        int halfWordIndex = wordLength / 2;

            for (int i = 0; i < 2; i++) {
                //newWord = word.charAt(i);
                System.out.print(word.substring(0,halfWordIndex));


            }

        }




    }

