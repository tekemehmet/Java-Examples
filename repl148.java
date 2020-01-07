package replyStudy;

import java.util.Scanner;

public class repl148 {

    // Given method called cube.
    // Write all required code inside this method in order
    // to asks the user for a number and then prints the cubed value of that number:
    //
    //Example:
    //
    //input: 5
    //output: 125
    //
    //hint: cube of a number n = n*n*n
    public static void cube() {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(input*input*input);
        //your code here
    }//end cube

    public static void main(String[] args) {

        cube();
    }
}
