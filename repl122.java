package replyStudy;

import java.util.*;

public class repl122 {

    public static void main(String[] args) {

        // Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.
        //
        //Example:
        //
        //nums -> [1, 1, 2, 3, 4, 3, 4]
        //         2

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        for (int j = 0; j < nums.length; j++) {

            int count = 0;

            for (int i = 0; i < nums.length;i++ ) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(nums[j]);
            }
        }

    }
}




