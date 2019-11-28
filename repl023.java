package replyStudy;

import java.util.Scanner;

public class repl023 {

    public static void main(String[] args) {
        /*
        Write a program that asks user to input int values: areaCode and localNumber.

        -Using concatenation put together in this format and assign to String phoneNumber  variable:

        -(222)-3334444

                -Write a print statement that displays (use phoneNumber variable ):
        Calling number (222)-3334444
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("area Code");
        int areaCode = scan.nextInt();

        System.out.println("local number");
        int localNumber = scan.nextInt();

        String phoneNumber = "(" + areaCode + ")-" + localNumber ;
        System.out.println(phoneNumber);

    }
}
