package replyStudy;

import java.util.Scanner;

public class repl101 {

    public static void main(String[] args) {


        // Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
        //Example:
        //input: We study java not python
        //output: true
        //
        //Example:
        //input: What's the difference between java, javascript and python?
        //output: false

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();



        String javaWord = " ";
        String pythonWord = " ";
        int javaCounter = 0;
        int pythonCounter = 0;
        boolean isEqual = true ;
        for (int x = 0; x < sentence.length()-3; x++) {
            if (sentence.substring(x, x + 4).equals("java")) {
                javaCounter++;
            }
        }
            for (int y = 0; y < sentence.length() - 5; y++) {
                if (sentence.substring(y, y + 6).equals("python")) {
                    pythonCounter++;
                }
            }

           // System.out.println(javaCounter + " and " + pythonCounter);

            if (pythonCounter == javaCounter) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }

    }

