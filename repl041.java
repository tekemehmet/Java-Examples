package replyStudy;

import java.util.Scanner;

public class repl041 {

    public static void main(String[] args) {

        // U have an Integer number already declared and assigned value.
        //
        //Using Multi-Branch if statements, check if number is positive, negative or zero.
        // Please follow the below examples and print message accordingly:

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        if ( number > 0 ) {
            System.out.println(number + " is positive");
        } else if (number < 0 ) {
            System.out.println(number + " is negative");
        } else {
            System.out.println("it is zero");
        }




    }
}
