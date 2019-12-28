package replyStudy;

import java.util.Scanner;

public class repl106 {

    public static void main(String[] args) {

        // Inputs:
        //String word;
        //
        //Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
        //In: howdyho
        //oo
        //
        //In: huehuehuehue
        //ueueueue
        //
        //In: poopoo what idk what im doing
        //ooooaiaio

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        int wordLength = word.length();

        for (int index = 0; index < wordLength; index++) {
            String currentChar = word.substring(index,index+1);
            if (currentChar.equals("e") || currentChar.equals("a") || currentChar.equals("i") || currentChar.equals("o") ||
            currentChar.equals("u")){
                System.out.print(currentChar);
            }

        }
    }
}
