package replyStudy;

import javax.swing.*;
import java.util.Scanner;

public class repl049 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int grade = s.nextInt();

        // In this assignment you will get a grade int and using ifs output if it's a passing grade or failure.
        //if grade is bigger then 90 output "excellent"
        //
        //
        //if the grade is bigger then 70 and smaller then 90 output "good"
        //
        //
        //if grade is bigger then 60 and smaller then 70 output "pass"
        //
        //
        //if grade is smaller then 60 output "fail"

        if ( grade > 90) {
            System.out.println("excellent");
        } else if (grade > 70 && grade < 90) {
            System.out.println("good");
        } else if ( grade > 60 && grade < 70) {
            System.out.println("pass");
        } else if (grade < 60) {
            System.out.println("fail");
        }

    }
}
