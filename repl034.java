package replyStudy;

import java.util.Scanner;

public class repl034 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemprice = scan.nextInt();

        int quarters = 0;
        //System.out.println(quarters);
       // int dimes =  (100-quarters*25) / 10;
        //int nickles = (100-dimes*10) / 5;

        if (itemprice < 25 || itemprice > 100) {
            System.out.println("Invalid price! ");
        } else if (itemprice % 5 != 0) {
            System.out.println("Invalid price! ");
        } else if (((100-itemprice) / 25) >=1 ) {
            quarters = (100-itemprice)/25;
            int dimes = (100-itemprice-quarters*25) / 10;
           // System.out.println(dimes);
            int nickles = (100-itemprice-quarters*25-dimes*10) / 5;
           // System.out.println(nickles);

            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickles + " nickels.");
        } else if ((100-itemprice) / 25 <=1){
            quarters = 0;
            int dimes = (100-itemprice)/10;
            //System.out.println(dimes);
            int nickles = (100-itemprice-dimes*10) / 5;
            //System.out.println(nickles);
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickles + " nickels.");
        }



    }

}
