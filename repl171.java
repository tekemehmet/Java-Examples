package replyStudy;

import java.util.Arrays;

public class repl171 {

    public static void main(String[] args) {
        // Given a 8x8 two-dimensional array of strings named chessboard.
        // Initialize values inside an array accordingly to the chess board. So first element in the array,
        // chessboard[0][0] should have a value "1a", and last element in the array,
        // chessboard[7][7] should have a value "8h".

        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE
       int a = 1;
        for (int i = 0; i < chessBoard.length ; i++) {
            char b = 'a';
            for (int j = 0; j < chessBoard.length ; j++) {

                chessBoard[i][j] = ""+a+b+"";
                ++b;
            }

            ++a;
        }

        //DO NOT CHANGE
     System.out.println(Arrays.deepToString(chessBoard));


    }
}
