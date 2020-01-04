package replyStudy;

import java.util.Arrays;
import java.util.Scanner;

public class repl134 {

    public static void main(String[] args) {

        // Given two arrays of ints sorted in increasing order, outer and inner,
        // print out true if all of the numbers in inner appear in outer.
        // Take advantage of the fact that both arrays are already in sorted order.
        //Example:
        //input (outer): 1, 2, 4, 6
        //input (inner): 2, 4
        //output: true
        //
        //Example:
        //input (outer): 1, 2, 4
        //input (inner): 6, 5
        //output: false
        Scanner scan = new Scanner(System.in);
        System.out.println("Size inner:");
        int sizeInner = scan.nextInt();
        System.out.println("size outer");
        int sizeOuter = scan.nextInt();

        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];

        for(int i =0; i < sizeInner; i++) {
            System.out.println("enter " + i + " for inner array ");
            inner[i] = scan.nextInt();
        }

        for(int j =0; j < sizeOuter; j++) {
            System.out.println("enter " + j + " for outer array ");
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        System.out.println("inner = " + Arrays.toString(inner));
        System.out.println("outer = " + Arrays.toString(outer));
        //WRITE YOUR CODE HERE
        //boolean isSorted = true;
        int count = 0;

        for (int i = 0; i < sizeInner; i++) {
            for (int j = 0; j < sizeOuter; j++) {
                if (inner[i] == outer[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count==sizeInner);

//        for (int i = 0; i < outer.length; i++) {
//            if(inner[inner.length-1] < outer[outer.length-1] && outer[0]<inner[0] ){
//                isSorted = true;
//            } else {
//                isSorted = false ;
//            }
//
//        }
//        System.out.println(isSorted);

    }
}
