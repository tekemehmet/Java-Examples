package replyStudy;

import java.util.Scanner;

public class repl092 {

    public static void main(String[] args) {

        // In mathematics, the factorial of a positive integer n,
        // denoted by n!, is the product of all positive integers less than or equal to n.
        // Calculate factorial and output result to the console.

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int x = 1;
        long fact = 1L;
        while (x <= n) {

            fact = fact * x ;
            x++;
        }

            System.out.println(fact);

        }

    }

