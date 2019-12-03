package replyStudy;

import java.util.Scanner;

public class repl037 {

    public static void main(String[] args) {

        //The video game machines at your local arcade output coupons according to
        //how well you play the game. You can redeem 10 coupons for a candy bar or 3
        //coupons for a gumball. You prefer candy bars to gumballs. Write a program that
        //defines a variable initially assigned to the number of coupons you win. Next,
        //the program should output how many candy bars and gumballs you can get if
        //you spend all of your coupons on candy bars first, and any remaining coupons
        //on gumballs.
        //
        //if you the coupons are not enough for any redeem, display message:
        //"Not enough coupons"

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int numOfCoupon = scan.nextInt();

        int candy = 10;
        int gumball = 3;

        int numCandy = numOfCoupon / candy;
        //int numGumBall = numOfCoupon / gumball;
        int remainderCandy = numOfCoupon % candy;
        int numGumball = remainderCandy / gumball;

        if ( numOfCoupon < 3 ) {
            System.out.println("Not enough coupons");

        } else if (numOfCoupon > 10 ) {
            System.out.println("Number of Candies: " + numCandy);
            System.out.println("Number of Gumballs: " + numGumball);
        } else if ( numOfCoupon < 10 && numOfCoupon >=3 ) {
            System.out.println("Number of Candies: " + numCandy);
            System.out.println("Number of Gumballs: " + numGumball);
        }

    }

}
