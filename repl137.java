package replyStudy;

import java.util.Scanner;

public class repl137 {

    public static void main(String[] args) {

        // Given a String variable sentence, write code to type each word in separate lines in a reverse order.
        //Example:
        //sentence -> "Java is fun"
        //Print
        //fun
        //is
        //Java
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below

        String[] arr = sentence.split(" ");

        int size = arr.length;
        int lastIndex = size-1;
        int middleIndex = size/2;



        for (int x = 0; x < middleIndex; x++) {

           // System.out.println( "Before Swap " + arr[x] + "----" + arr[lastIndex - x ] ) ;

            String temp = arr[x];

            arr[x] = arr[lastIndex-x];
            arr[lastIndex-x] = temp;
           // System.out.println( "After Swap " + arr[x] + "----" + arr[lastIndex - x ] ) ;

        }
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);

        }


    }
}
