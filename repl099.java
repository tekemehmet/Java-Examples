package replyStudy;

import java.util.Scanner;

public class repl099 {

    public static void main(String[] args) {

        // Given a string, consider the prefix string made of the first n chars of the string.
        // Does that prefix string appear somewhere else in the string?
        //Assume that the string is not empty and that n is in the range from 1 till str.length().
        //
        //Example:
        //input: abXYabc
        //input: 1
        //output: true
        //a appears twice
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();


        String keyWord = str.substring(0,n);
       // System.out.println("keyWord = " + keyWord);
        int counter = 0;

        for (int x = 0; x < str.length()-n ; x++) {
            String keyWordCompare = str.substring(x,x+n);
           // System.out.print("keyWordCompare = " + keyWordCompare+" ");
            if(keyWord.equals(keyWordCompare) ){
                counter++;
             //   System.out.println("counter = " + counter);
            }

        }
        if( counter >= n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        }


    }

