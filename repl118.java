package replyStudy;

import java.util.Arrays;
import java.util.Scanner;

public class repl118 {

    public static void main(String[] args) {

    // The code provided in your main method will take in six Strings and save them into an array called arr.
    //Print out the 43 neighboring items of array in one line until the last line
    //each line should contain 3 neighboring items of array element as displayed below
    //user for loop
    //
    //Example:
    //arr -> ["apple", "banana","kiwi", "grape","milk","soda"]
    // prints:  apple , banana , kiwi
    //          banana , kiwi , grape
    //          kiwi , grape , milk
    //          grape , milk , soda
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++){
            arr[i] = input.nextLine();
        }
        for (int i = 0; i < 4 ; i++) {
            System.out.println(arr[i] + " , " + arr[i+1] + " , " + arr[i+2]);
        }

    }
}
