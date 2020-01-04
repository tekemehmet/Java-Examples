package replyStudy;

import java.util.Arrays;
import java.util.Scanner;

public class repl133 {

    public static void main(String[] args) {

        // Given an int variable decimal,  write java program to calculate binary value of the decimal
        // variable and assign it binary array. print out value of binary array matching below format.
        // Feel free to use additional arrays or formulas.
        //
        //Example:
        //decimal -> 3
        //binary -> [0, 0, 0, 0, 0, 0, 1, 1]
        //
        //decimal -> 35
        //binary -> [0, 0, 1, 0, 0, 0, 1, 1]
        //
        //decimal -> 255
        //binary -> [1, 1, 1, 1, 1, 1, 1, 1]

        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        //TODO: Write your code below.

        for(int i=binary.length-1;i>=0;i--){
            if(decimal!=0){
                binary[i]=decimal%2;
                decimal=decimal/2;
            }else{
                binary[i]=0;
            }
        }
        System.out.println(Arrays.toString(binary));



    }
}
