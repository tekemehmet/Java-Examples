package replyStudy;

import java.util.Scanner;

public class repl161 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        int reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        // reversed integer is stored in variable
        while( num != 0 ){

            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;

        }
        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(true);
        else
            System.out.println(false);



    }
}