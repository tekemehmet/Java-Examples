package replyStudy;

import java.util.*;

public class repl124 {

    public static void main(String[] args) {

        // Given an array nums with 7 integers already assigned, write code to reverse it.
        //Do not use any additional arrays or Strings.
        //
        //Example:
        //
        //nums -> [4, 3, 2, 44, 1, 100, 55]
        //change it to:
        //nums -> [55, 100, 1, 44, 2, 3, 4]

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int size = nums.length;
        int lastIndex = size-1;
        int midPoint = size/2;
        for (int x = 0; x < midPoint ; x++) {

            int temp = nums[x];

            nums[x] = nums[lastIndex-x];
            nums[lastIndex-x] = temp;

        }


        System.out.println(Arrays.toString(nums));
    }
}
