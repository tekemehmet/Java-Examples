package replyStudy;

public class repl150 {
    // Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
    //
    //
    //*****
    //*   *
    //*   *
    //*   *
    //*****
    //
    //hint:you will need to use two nested for loops for that,
    // and an if that checks if its the last or first iteration of the loop
    // (so you will know whet to print "*" or " ")

    public static void printHollowRect(){


        for (int i = 1; i <= 5 ; i++) {
           if(i == 1 || i == 5) {
                System.out.println("*****");
            }else {
               System.out.println("*   *");
            }

        }

    }

    public static void main(String[] args){

            printHollowRect();

        }

    }

