package day15_ForLoop;

import java.util.Scanner;

public class FullNameInRegularFormat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name:");
        String word = scan.nextLine();
        scan.close();

        String word1 = word.toLowerCase();
        String firstName = word1.substring (0,1).toUpperCase() + word1.substring(1, word.indexOf(" ")) ;
        String lastName = word1.substring (word.lastIndexOf(" ")+1,word.lastIndexOf(" ")+2).toUpperCase() + word1.substring (word.indexOf(" ")+2);

        System.out.println( firstName + " " + lastName );

    }
}
/*Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
*/
