package replyStudy;

import java.util.*;

public class repl126 {

    public static void main(String[] args) {

        // Write a program that will find out shortest words in the given string str.
        // If there are few words that are evenly short, print them all.
        // Use split method in order to split str string variable and create an array of strings.
        // Print array with Arrays.toString() method. Sort array before printing.
        //Split values by comma: split(", ");
        //input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
        //output: [cat, old, ray]
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] splited=str.split(", ");// or String[] splited=str.split(",\\s")
        int smallestWordLenght=splited[0].length();
        String smallestWord="";



        for(int i=1;i<splited.length;i++){
            if(splited[i].length()<smallestWordLenght){
                smallestWordLenght=splited[i].length();
            }
        }
        for(int i=0;i<splited.length;i++){
            if(splited[i].length()==smallestWordLenght){
                smallestWord+=(splited[i]+" ");
            }
        }
        String[] splitedSmall=smallestWord.split(" ");
        Arrays.sort(splitedSmall);
        System.out.println(Arrays.toString(splitedSmall));
        }
    }

