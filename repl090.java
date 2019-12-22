package replyStudy;

import java.util.Scanner;

public class repl090 {

    public static void main(String[] args) {

        // Write your code inside the method.
        //Use the values given as method parameters.
        //Assign final values.
        //Then user should select service quality that will correspond to tip percent.
        //Poor = 5%
        //Fair = 10%
        //Good = 15%
        //Great = 20%
        //Excellent = 25%
        //The program should display the following information based on the user input:
        //Split or No split
        //Number of people entered: &&&&
        //Service Quality:
        //Total to pay:
        //Total tip:
        //Total per person:
        //Tip per person:
        //https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8
        //
        //Input:
        //Split:Yes
        //Number of people:4
        //Check amount:476.0
        //Service Quality:Excellent

        Scanner scan = new Scanner(System.in);

        System.out.println("Split:");
        String Split = scan.next();

        System.out.println("Number of people:");
        int numOfPeople = scan.nextInt();

        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();

        System.out.println("Service Quality:");
        String serviceQuality = scan.next();


        double tip = 0;

        double tipPerPerson = 0;
        double totalPerPerson = 0;

        if (Split.equals("Yes")) {
            if (serviceQuality.equals("Poor")) {
                tip = (0.05 * checkAmount);
                tipPerPerson = tip / numOfPeople;
                totalPerPerson = (checkAmount + tip) / numOfPeople;
            } else if (serviceQuality.equals("Fair")) {
                tip = (0.1 * checkAmount);
                tipPerPerson = tip / numOfPeople;
                totalPerPerson = (checkAmount + tip) / numOfPeople;
            } else if (serviceQuality.equals("Good")) {
                tip = 0.15 * checkAmount;
                tipPerPerson = tip / numOfPeople;
                totalPerPerson = (checkAmount + tip) / numOfPeople;
            } else if (serviceQuality.equals("Great")) {
                tip = (0.20 * checkAmount);
                tipPerPerson = tip / numOfPeople;
                totalPerPerson = (checkAmount + tip) / numOfPeople;
            } else if (serviceQuality.equals("Excellent")) {
                tip = 0.25 * checkAmount;
                tipPerPerson = tip / numOfPeople;
                totalPerPerson = (checkAmount + tip) / numOfPeople;
            }
            String people = "&";
            for (int i = 1; i < numOfPeople; i++) {
                people +="&";
            }
            System.out.println("Number of people entered: " + people);
                System.out.println("Total to pay: " + (checkAmount + tip));
                System.out.println("Total tip: " + tip);
                System.out.println("Total per person: " + totalPerPerson);
                System.out.println("Tip per person: " + tipPerPerson);

            } else if (Split.equals("No")) {
                if (serviceQuality.equals("Poor")) {
                    tip = (0.05 * checkAmount);
                    tipPerPerson = tip / numOfPeople;
                    totalPerPerson = (checkAmount + tip) / numOfPeople;
                } else if (serviceQuality.equals("Fair")) {
                    tip = (0.1 * checkAmount);
                    tipPerPerson = tip / numOfPeople;
                    totalPerPerson = (checkAmount + tip) / numOfPeople;
                } else if (serviceQuality.equals("Good")) {
                    tip = 0.15 * checkAmount;
                    tipPerPerson = tip / numOfPeople;
                    totalPerPerson = (checkAmount + tip) / numOfPeople;
                } else if (serviceQuality.equals("Great")) {
                    tip = (0.20 * checkAmount);
                    tipPerPerson = tip / numOfPeople;
                    totalPerPerson = (checkAmount + tip) / numOfPeople;
                } else if (serviceQuality.equals("Excellent")) {
                    tip = 0.25 * checkAmount;
                    tipPerPerson = tip / numOfPeople;
                    totalPerPerson = (checkAmount + tip) / numOfPeople;
                }
                System.out.println("Number of people: " + numOfPeople);
                System.out.println("Total to pay: " + (checkAmount + tip));
                System.out.println("Total tip: " + tip);
                //System.out.println("Total per person: " + totalPerPerson );
                //System.out.println("Tip per person: " + tipPerPerson);

            }


        }
    }
