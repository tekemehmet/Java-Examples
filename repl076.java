package replyStudy;

import java.util.Scanner;

public class repl076 {

    public static void main(String[] args) {

        // In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything.
        //
        //Example:
        //input: mike_tyson@gmail.com
        //output: tyson_mike@gmail.com
        //
        //Example:
        //input: barakobama@gmail.com
        //output: barakobama@gmail.com

        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        int edCharIndex = email.indexOf("@");

        if( email.contains("_")){
            int underScoreIndex = email.indexOf("_");

            String name1 = email.substring(0,underScoreIndex);
            //System.out.println("name1 = " + name1);

            String name2 = email.substring(underScoreIndex+1,edCharIndex);
            //System.out.println("name2 = " + name2);

            System.out.println(name2+ "_"+ name1+"@gmail.com");

        } else {
            System.out.println(email);
        }



    }
}
