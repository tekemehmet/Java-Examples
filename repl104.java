package replyStudy;

import java.util.Scanner;

public class repl104 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();
        String json2 = json;
        String search = "\"firstName\"";

        if (json.contains(search)) {
            json = json.substring(json.indexOf(search) + search.length() + 3);
            json = json.substring(0, json.indexOf("\""));
        }
//        else {
//            json = "invalid search";
//        }
        System.out.println("First name: " + json);

        search = "\"lastName\"";
        if (json2.contains(search)) {
            json2 = json2.substring(json2.indexOf(search) + search.length() + 3);
            json2 = json2.substring(0, json2.indexOf("\""));
        }
//        } else {
//            json = "invalid search";
//        }

        System.out.println("Last name: " + json2);

    }

    }

