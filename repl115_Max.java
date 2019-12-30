package replyStudy;

import java.util.Scanner;

public class repl115_Max {

    public static void main(String[] args) {

        // Given an array num, get the max number in nums and print out to console.
        //
        //nums → [2, 4, 2, 3, -2]) → 4
        //nums → [2, 2, 5, 3, 0 ]) → 5
        //nums → [1, 33, 5, 7, 9]) → 33

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int maxValue= nums[0];

        for (int i = 0; i < nums.length; i++) {
            if( nums[i] > maxValue);
            maxValue = nums[i];
        }
        System.out.println(maxValue);




    }
}
