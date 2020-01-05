package replyStudy;

import java.util.Arrays;
import java.util.Scanner;

public class repl138 {

    public static void main(String[] args) {

        // Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.
        //
        //Example:
        //sentence -> "Java is fun"
        //reversed -> "fun is Java"

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        String[] arr = sentence.split(" ");

        int size = arr.length;
        int lastIndex = size-1;
        int middleIndex = size/2;

        for (int i = 0; i < middleIndex; i++) {

            String temp = arr[i];

            arr[i]= arr[lastIndex-i];

            arr[lastIndex-i] = temp;

        }

        reversed = Arrays.toString(arr);
        reversed = reversed.replace(",","");
        reversed = reversed.replace("[","");
        reversed = reversed.replace("]","");

        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}
