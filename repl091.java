package replyStudy;

import java.util.Arrays;

public class repl091 {

    public static void main(String[] args) {

        // Write a loop that displays all possible combinations of two letters where
        // the letters are 'z', or 'y', or 'x', or 'w', or 'v'.
        // The combinations should be displayed in descending alphabetical order:
        //
        //zz
        //zy
        //zx
        //zw
        //zv
        //yz
        //....
        //vv

        char [] letter = {'z','y','x','w','v'};
        //System.out.println(Arrays.toString(letter));

        for (int i = 0; i < letter.length ; i++) {
            for (int j = 0; j < letter.length; j++) {

                System.out.println("" + letter[i] + letter[j]);


            }
        }





    }
}
