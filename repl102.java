package replyStudy;

import java.util.Scanner;

public class repl102 {

    public static void main(String[] args) {
        //Write a program, that will read html variable and output attribute value of id attribute (tag) into the console.
        // Input will be provided in a single line as outlined below.
        // If html variable doesn't contain <html> attribute, print out into the console message: "Invalid input!".

        //Example:
        //input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
        //output: myid

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();


        if(str.contains("<html>")){
            str=str.substring(str.indexOf("id=\"")+4);
            //System.out.println(str);
            str=str.substring(0,str.indexOf("\""));
            //System.out.println(str);
        }else
            str="Invalid input!";
        System.out.println(str);
    }
}
