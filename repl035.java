package replyStudy;


import java.util.Scanner;

public class repl035 {

    public static void main(String[] args) {

        int Smartphone = 300;
        int Laptop = 400;
        int Charger = 15;
        int USBCable = 10;
        int HeadPhones = 30;
        int Pants = 50;
        int Hat = 25;
        int Socks = 5;
        int Blanket = 60;
        int Pillow = 40;

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();


        if (item.equals("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Charger")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:" + (100-Charger)+"$");
        }else if (item.equalsIgnoreCase("USB cable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:" + (100-USBCable)+"$");
        } else if (item.equals("Headphones")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:" + (100-HeadPhones)+"$");

        } else if (item.equals("Pants")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:" + (100-Pants)+"$");
        } else if (item.equals("Hat")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:" + (100-Hat)+"$");
        } else if (item.equals("Socks")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:" + (100-Socks)+"$");
        } else if (item.equals("Blanket")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:" + (100-Blanket)+"$");
        } else if (item.equals("Pillow")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:" + (100-Pillow)+"$");
        }else {
            System.out.println("Invalid item!");
        }



    }
}