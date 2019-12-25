package replyStudy;

import java.util.Scanner;

public class repl075 {

    public static void main(String[] args) {

        //he wants to add more conditions to his program,
        // he wants only job related mails so he will narrow it down by also checking if the word "project" also appears beside his name,
        // that way he will be sure its a job email that refers to him.
        //
        //
        //for example:
        //
        //a = "dear alejandro.....alot of text"
        //
        //outputs: "dont read"
        //
        //a = "thunder blaz is the best drink in the galaxy..."
        //
        //outputs: "dont read"
        //
        //a = "subject : important project, alejandro we refer to you  this ...."
        //
        //outputs: "read this mail"


        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //your code here
        if(a.contains("alejandro") && a.contains("project")){
            System.out.println("read this mail");
        } else {
            System.out.println("dont read");
        }



    }
}
