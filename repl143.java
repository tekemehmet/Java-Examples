package replyStudy;

import java.util.Arrays;

public class repl143 {

    public static void main(String[] args) {

        // Two-dimensional Arrays - 2D array has a type such as int[][] or String[][], with two pairs of square brackets.
        // The elements of a 2D array are arranged in rows and columns, and the new operator for 2D arrays specifies
        // both the number of rows and the number of columns.
        //
        //You have  2D array multiplicationTable declared with 10 rows and 10 columns.
        //Write java program to populate the array with multiplication table values like in the picture below:
        int[][] multiplicationTable = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationTable[i][j]= (i+1)*(j+1);
            }
        }

        System.out.println(Arrays.deepToString(multiplicationTable) ) ;
    }


    }

