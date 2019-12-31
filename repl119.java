package replyStudy;

import java.util.Arrays;
import java.util.Scanner;

public class repl119 {

    public static void main(String[] args) {

        //Given a String variable email, write code using split method to print email id and domain in separate lines.
        //
        //Example:
        //email -> info@cybertekschool.com
        //Print:
        //Email id: info
        //Email domain: cybertekschool.com
        //If email contains no @ character or multiple @ characters then print invalid email:

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();


        String [] mailArray = email.split("@");
        System.out.println(Arrays.toString(mailArray));
        int arrayLength = mailArray.length;
        if (arrayLength == 2){
            System.out.println("Email id: " + mailArray[0]);
            System.out.println("Email domain: " + mailArray[1]);
        } else {
            System.out.println("invalid email");
        }





    }
}
