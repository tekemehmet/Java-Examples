package replyStudy;

import java.util.Scanner;

public class repl162 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int x0 = 0;
        int x1 = 1;
        int sum = 0;
        for (int i = 1; i <= num; ++i) {

                sum = x0 + x1;
                x0 = x1;
                x1 = sum;
            }
        System.out.println(x0);

    }

}








