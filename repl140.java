package replyStudy;

import java.util.Arrays;
import java.util.Scanner;

public class repl140 {

    public static void main(String[] args) {

        // Given a String array words, iterate through each word and print first and last letter of each element in the format below.
        //
        //Example:
        //
        //words → ["hello", "why", "by", "apple" , "note"]
        //print → [ho, wy, by, ae, ne]
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below
        String shortWord ="";
        for (String eachWord : words) {
            shortWord += ""+eachWord.charAt(0)+eachWord.charAt(eachWord.length()-1)+" ";
        }
        String[] arr = shortWord.split(" ");
        System.out.println(Arrays.toString(arr));


    }
}
