package replyStudy;

public class repl071 {

    public static void main(String[] args) {

        // Write a program that will print out even numbers from 2 to 100 through the comma.

        for (int x = 2; x <= 100 ; x++) {
            if (x % 2 == 0 ) {
                System.out.print(x+",");
            }

        }
    }
}
