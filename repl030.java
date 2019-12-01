package replyStudy;

import java.util.Scanner;

public class repl030 {

    public static void main(String[] args) {

        String item1; // Tomatoes;
        String item2; //Cheese;
        String item3; // Apples;
        String report = "";


        double price1; //5.5
        double price2; //3.5
        double price3; //6.3
        double totalPrice = 0;

        int count1, count2, count3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();
        //System.out.println("Item1 is " + item1 + ", count is " + count1 + ", price: " + price1);

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        scan.nextLine();
        price2 = scan.nextDouble();
        //System.out.println("Item2 is " + item2 + ", count is " + count2 + ", price: " + price2);

        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        scan.nextLine();
        price3 = scan.nextDouble();
        //System.out.println("Item1 is " + item3 + ", count is " + count3 + ", price: " + price3);



        if ( count1 > 0 && count2 > 0 && count3 > 0) {
            totalPrice = count1*price1 + count2*price2 + count3*price3;
            report = "Item1: " + item1 +  " Price: " + price1*count1 + ", Item2: " + item2 + " Price: " + price2*count2 +", Item3: " + item3
                    + " Price: " + price3*count3;

        } else if (count1 > 0 && count2 == 0 && count3 > 0 ) {
            totalPrice = count1*price1 + count3*price3;
            report = "Item1: " + item1 +  " Price: " + price1*count1 + ", Item3: " + item3
                    + " Price: " + price3*count3;

        } else if (count1 > 0 && count2 > 0 && count3 == 0 ){
            totalPrice = count1*price1 + count2*price2;
            report = "Item1: " + item1 +  " Price: " + price1*count1 + ", Item2: " + item2
                    + " Price: " + price2*count2;

        }

        System.out.println(report);

        System.out.println("Total price: " + totalPrice);




    }
}