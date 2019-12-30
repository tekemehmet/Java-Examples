package replyStudy;

import java.util.Scanner;

public class repl116 {

    public static void main(String[] args) {

        //Given an array nums, calculate the count of even numbers in nums and print out to console.
        //
        //nums → [2, 1, 2, 2, 1, 2,  3,  4, 3, 4]) → 6
        //nums → [2, 2, 5, 7, 9, 0,  3,  5, 2, 2]) → 5
        //nums → [1, 1,21,21,25,13, 17, 29, 11,3])  → 0
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0 ; i<=9 ; i ++){
            nums[i] = input.nextInt();
        }

        int countEven = 0;
        for (int i = 0; i < 10; i++) {
            if (nums[i] % 2 == 0){
                countEven++;
            }

        }
        System.out.println(countEven);

    }
}
