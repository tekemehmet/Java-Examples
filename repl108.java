package replyStudy;

import java.util.Scanner;

public class repl108 {

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String star = " ";

        for ( i = 1; i <= n ; i++) {
            //star = star + "* ";
            star += " *";
            System.out.println(star);

        }

        }
}
