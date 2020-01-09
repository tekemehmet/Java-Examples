package replyStudy;

import HackerRank.If_Else_Challenge;

import java.util.Scanner;

public class repl157 {

    public static void main(String[] args) {
        // Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
        //Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
        // Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
        //Function Description
        //It should print a new string representing the input time in 24 hour format.
        //timeConversion has the following parameter(s):
        //s: a string representing time in  12 hour format
        //
        //Input: 07:05:45PM
        //Output: 19:05:45
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {


        int hour  = Integer.parseInt( s.split(":")[0] );
        int minute  = Integer.parseInt( s.split(":")[1] );
        String minuteStr = s.split(":")[1];
        String secondAMPM =  s.split(":")[2];
        String secondStr = secondAMPM.substring(0,2);
        String isAMPM = secondAMPM.substring(2);
        int secondInt = Integer.parseInt(secondStr);

        if(hour==00 && minute==00 && secondAMPM.equals("00AM")){
            System.out.println("00:00:00");
        }else if( hour==12 && minute==00 && secondAMPM.equals("00PM") ) {
            System.out.println("12:00:00");
        } else if (isAMPM.equals("AM")  ) {
            System.out.println(s.substring(0,8));

        }else if( isAMPM.equals("PM")){
            System.out.println( (hour+12)+":"+minuteStr+":"+secondStr );
            }




    }
}
