package replyStudy;

import java.util.Scanner;

public class repl115 {
    public static void main(String[] args) {

        //Given an array num, calculate the sum of all numbers in nums and print out to console.
        //
        //nums → [2, 1, 2, 3, 4]) → 12
        //nums → [2, 2, 0, 3, 5]) → 12
        //nums → [1, 3, 5, 7, 9]) → 25

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int sum = 0;

        for (int eachItem : nums) {
            sum = sum+eachItem;
        }
        System.out.println(sum);

    }
}
