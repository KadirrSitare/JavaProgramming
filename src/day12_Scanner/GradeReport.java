package day12_Scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your score: ");
        int score = scan.nextInt();
        String result = "";

        if (score>=1 && score<=100){
            result = (score>=85)? "A" : (score>=75)? "B" :(score>=65)? "C" :
                    (score>=55)? "D" :"F" ;
        }else {
            result= "Invalid score";
        }
        System.out.println(result);


    }
}
/*
 GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */