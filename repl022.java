package replyStudy;

import java.util.Scanner;

public class repl022 {
    public static void main(String[] args) {

        //WRITE YOUR CODE HERE:
        String item1; // Tomatoes;
        String item2; //Cheese;
        String item3; // Apples;
        String report;


        double price1; //5.5
        double price2; //3.5
        double price3; //6.3
        double totalPrice;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1 and its price:");
        item1 = scan.next();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        item2 = scan.next();
        scan.nextLine();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3 and its price:");
        item3 = scan.next();
        scan.nextLine();
        price3 = scan.nextDouble();

        totalPrice = price1 + price2 + price3;

        System.out.println("Item1: " + item1 +  " Price: " + price1 + ", " + "Item2: " + item2 + " Price: " + price2 +"," + " Item3: " + item3
                + " Price: "+price3);



        System.out.println("Total price: "+totalPrice);


    }
}



