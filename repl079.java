package replyStudy;

import java.util.Scanner;

public class repl079 {

    public static void main(String[] args) {

        // Given a string word, if the first or last chars are 'x' or 'X',
        // print the string without those 'x' or 'X' chars,
        // otherwise print the string unchanged

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int wordLength = word.length();
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(wordLength-1);

        if(( firstChar == 'x' || firstChar == 'X') && (lastChar == 'x' || lastChar == 'X') ) {
            System.out.println(word.substring(1, wordLength- 1));
        } else if ( (firstChar !='x' || firstChar !='X') && (lastChar == 'x' || lastChar == 'X')) {
            System.out.println(word.substring(0, wordLength - 1));
        } else if (  (firstChar == 'x' || firstChar == 'X') &&  (lastChar != 'x' || lastChar != 'X')  ){
            System.out.println(word.substring(1,wordLength) );
        } else {
            System.out.println(word);
        }

    }
}
