package replyStudy;

import java.util.Scanner;

public class repl082 {

    public static void main(String[] args) {


        // In this exercise you get a string called txt .
        //
        //output txt without its last letter.
        //
        //for example:
        //
        //txt = "foo"
        //
        //output will be:
        //fo

        Scanner s = new Scanner(System.in);
        String txt = s.next();

        int lastCharIndex = txt.length() - 1;
        System.out.println(txt.substring(0,lastCharIndex));


    }
}