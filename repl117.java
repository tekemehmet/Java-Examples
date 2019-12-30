package replyStudy;

import java.util.Scanner;

public class repl117 {

    public static void main(String[] args) {

        // The code provided in your main method will take in eight Strings and save them into an array called arr.
        //Print out the 4 lines using for loop:
        //each line should contain a pair of array element as displayed below
        //user for loop
        //
        //Example:
        //arr -> ["apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"]
        // prints:  apple , banana
        //          kiwi , grape
        //          milk, "soda"
        //          juice, coffee

    Scanner input = new Scanner(System.in);
    String[] arr = new String[8];

    for (int i=0; i<8; i++) {
        arr[i] = input.nextLine();
    }

    for (int i = 0; i < 8 ; i+=2){
        System.out.println(arr[i]+" , "+arr[i+1] );
        }
    }
}