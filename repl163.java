package replyStudy;

import java.util.Scanner;

public class repl163 {

    public static void main(String[] args) {

        // Create a method that gets an array of strings and a string, the method returns an int.
        //
        //It counts how many times a string appears in the array and returns the count.
        //
        //for example (pseudo code):
        //
        //some_array = ["a","foo","bar","foo","bla"]
        //
        //some_string = "foo"
        //
        //count_appearance(some_array ,some_string )
        //
        //will return 2 because some_array  has 2 appearances of "foo" string

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] arr = new String[size];


        for (int i = 0; i < size; i++) {
            arr[i] = scan.next();
        }

        String t = scan.next();

    //    count_appearance(arr, t);
    }

    public int count_appearance(String[] arr, String t) {


        int count = 0;
        for (String each : arr) {
            if (t.equals(each)) {
                count++;
            }

        }
        if (count > 1)


            return count;
        return count;
    }

}


