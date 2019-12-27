package replyStudy;

public class repl105 {

    public static void main(String[] args) {

        // Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'.
        // The combinations should be displayed in descending alphabetical order:


        for (char i = 'z'; i >= 'v'; i--) {
            for (char j = 'z'; j >= 'v'; j--) {
                System.out.println(""+i + j + "");

            }

        }

    }
    }

