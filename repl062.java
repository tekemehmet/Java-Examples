package replyStudy;

import java.util.Scanner;

public class repl062 {

    public static void main(String[] args) {

        // Example:
        //Display message: "Please enter the text:"
        //input: java
        //Display message: "Length is: 4"

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text = scan.nextLine();

        System.out.println("Length is: " + text.length());
    }
}
