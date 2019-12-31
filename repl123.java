package replyStudy;

public class repl123 {
    public static void main(String[] args) {

        // The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year,
        // this is a simple implementation of the algorithm. You will need to use loops to create it.
        //Show 10 years of growth of the Utopian Tree.

        int years = 10;
        int growRate = 2;
        int sum = 3;
        System.out.println("year 1 - growth " + 1 +" cm");
        System.out.println("tree size: " + 1 + "cm" );
        System.out.println("year 2 - growth " + 1 +" cm");
        System.out.println("tree size: " + 2 + "cm" );
        System.out.println("year 3 - growth " + 1 +" cm");
        System.out.println("tree size: " + 3 + "cm" );

        for (int x = 4; x <= 10; x++) {
            sum = sum + 2;

            System.out.println("year "+ x + " - growth " + growRate +" cm");
            System.out.println("tree size: " + sum + "cm" );




        }


    }
}
