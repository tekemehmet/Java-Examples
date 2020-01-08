package replyStudy;

import java.util.Arrays;
import java.util.Scanner;

public class repl153 {

    public static void main(String[] args) {

        //The method person get a string with this format : "name,last name,age"
        //for example:
        //
        //person("jon,doe,30");
        //
        //the output is:
        //
        //person name: jon last name: doe age: 30
        //
        //hint: use the split method to split the string to a string array where there is a "," char

        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;


    }

    public static void person(String info){

        String[] s = info.split(",");

       // System.out.println(Arrays.toString(array));

        System.out.println("person name: " + s[0] + " last name: " + s[1] + " age: " + s[2]);


    }
}
