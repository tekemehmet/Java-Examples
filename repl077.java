package replyStudy;

import java.util.Scanner;

public class repl077 {

    public static void main(String[] args) {



        //Write a program that will print out information about user based on email.
        // Print first and last name from the upper case
        // Example:
        //Input: craig_federighi@apple.com
        //Output:
        //First name: Craig
        //Last name: Federighi
        //Domain: apple
        //Top-Level Domain: com

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int lastCharIndex = email.length()-1;
        int edIndex = email.indexOf("@");
        int underScoreIndex = email.indexOf("_");
        int dotIndex = email.indexOf(".");

        String firstName = email.substring(0, underScoreIndex).substring(0,1).toUpperCase()+email.substring(1,underScoreIndex).toLowerCase();

        String lastName = email.toUpperCase().charAt(underScoreIndex+1)+email.toUpperCase().substring(underScoreIndex+2,edIndex).toLowerCase();



        String domain = email.substring(edIndex+1,dotIndex);
        String topLevelDomain = email.substring(dotIndex+1);



        System.out.println("First name:" + firstName  );
        System.out.println("Last name:" + lastName   );
        System.out.println("Domain:" + domain);
        System.out.println("Top-Level Domain:" + topLevelDomain);

    }
}
