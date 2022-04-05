package day12_Scanner;

import java.util.Scanner;

public class House {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many people you live with:");
        int people = scan.nextInt();
        scan.close();
        String message = (people < 3) ? "Live with less than 3 people" : (people > 6) ? "Live with more than 6 people"
                : "Live with 3 - 6 people";
        System.out.println(message);

    }
}
/*
Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */