package replyStudy;

import java.util.Scanner;

public class repl042 {

    public static void main(String[] args) {

        // U have an Integer number already declared and assigned value.
        //
        //Using conditional statements, check if number is odd or even.
        // Please follow the below examples and print message accordingly:

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        if ( number % 2 == 0  ) {
            System.out.println(number + " is even");
        } else if ( number % 2 !=0 ){
            System.out.println(number + " is odd");
        }


    }
}
