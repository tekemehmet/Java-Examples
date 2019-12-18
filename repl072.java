package replyStudy;

import java.util.Scanner;

public class repl072 {

    public static void main(String[] args) {

        // in this exercise you get a string called txt .
        //output txt without its last letter.
        //
        //for example:
        //
        //txt = "foo"
        //
        //output will be:
        //fo
        //
        //hint
        //use substring() and length() togather to solve this.
        //substring will start at 0 and will end at txt length -1

        Scanner s = new Scanner(System.in);
        String txt = s.next();
        int lastIndex = txt.length()-1;
        System.out.println(txt.substring(0,lastIndex));

    }
}
