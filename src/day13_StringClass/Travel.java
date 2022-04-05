package day13_StringClass;

import java.util.Scanner;

public class Travel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cost = 0;
        System.out.println("Do you have a passport? Yes/No");
        String passport = scan.next().toLowerCase();
        if (passport.equals("yes")) {
            cost = 1000;
            System.out.println("Which country do you want to travel:");
            String country = scan.next();
            System.out.println("How many bags will you take with you:");
            byte bag = scan.nextByte();
            cost = cost + bag * 50;
            System.out.println("How many people will you travel with:");
            short people = scan.nextShort();
            if (people >= 0 && people <= 2) {
                cost = cost - people * 100;
            } else if (people >= 3) {
                cost = cost - 300;
            }
            System.out.println("Enter the name of the people you will travel with. " +
                    "\nSeperate the names with comma \",\"");
            scan.nextLine();
            String passengers = scan.nextLine();

            System.out.println("Your ticket is booked to " + country + ". We have charged extra for the " + bag + " bags but you are traveling with " + passengers + " so we are giving a discount. Your total cost is $" + cost);
        } else {
            cost = 200;
            System.out.println("Enter your passport expiration year:");
            int expireYear = scan.nextInt();
            int yearsOfExpiration = 2022 - expireYear;
            cost = cost + yearsOfExpiration * 75;
            System.out.println("Which country do you plan to travel:");
            String country = scan.next();
            System.out.println("Will you be travelling in the next year? Yes/No");
            String isTravelling = scan.next().toLowerCase();
            if (isTravelling.equals("yes")) {
                cost = cost + 100;
            } else {
                cost = cost - 50;
            }
            System.out.println("Looks like your password has been expired for " + yearsOfExpiration +
                    " years, but not to worry we will get it ready for you to travel to " + country + ". Your total cost has come out to $" + cost);
        }
        scan.close();
    }
}
/*
Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags but you are traveling with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel to $allCountries. Your total cost has come out to $costAmount."
 */