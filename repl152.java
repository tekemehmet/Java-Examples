package replyStudy;

import java.util.Scanner;

public class repl152 {

    public static void main(String[] args) {

        // Create a method called plus_minus that gets an array of ints (int[]),
        // it outputs how many negative , positive and zero numbers are in the array.
        //
        //for example:
        //
        //plus_minus (new int[]{1,2,55,-9,-2,0});
        //
        //will output:
        //positives:3, negatives:2, zeros:1

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];

        for(int i=0 ; i<=size-1; i++) {
            arr[i] = inp.nextInt();
        }

         plus_minus(arr);

    }

    public static void plus_minus(int[] array) {

        int countPos = 0;
        int countNeg = 0;
        int countZeros = 0;

        for (int i = 0; i < array.length ; i++) {
            if(array[i] > 0) {
                countPos++;
            } else if (array[i] < 0) {
                countNeg++;
            } else {
                countZeros++;
            }
        }
        System.out.println("positives:" + countPos +", negatives:" + countNeg + ",zeros:" + countZeros);

    }

}
