package replyStudy;

import java.util.Scanner;

public class repl125 {

    public static void main(String[] args) {
        //Write a program that will print the shortest word in the given array str.
        //
        //input: java, cable, red, vivid, remedy, grace
        //output: red

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        String shortest = str[0];
        for (int i = 0; i < str.length; i++) {
            if(str[i].length()< shortest.length()) {
                shortest = str[i];
            }

        }
        System.out.println(shortest);

    }
}
