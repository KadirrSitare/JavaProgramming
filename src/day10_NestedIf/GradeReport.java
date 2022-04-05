package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        int score = 75;
        String result = ""; //temporary

        if (score >= 0 && score <= 100) { //if the score is valid

            if (score >= 90) { //false: score <90
                result = "Excellent";
            } else if (score >= 80) {
                result = "Great";
            } else if (score >= 70) {
                result = "Good";
            } else if (score >= 60) {
                result = "Passed";
            } else {
                result ="Failed";
            }
        } else { // if the score is NOT valid
            result = "Invalid Score";
        }

        System.out.println(result);

        System.out.println("-----------------------------------");

        //solution2: use ternaries ONLY

        String result2 = (score >= 0 && score <= 100)? (score >= 90)? "Excellent" :(score >= 80)? "Great" :(score >= 70)? "Good"
                :(score >= 60)? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result2);

        System.out.println("-----------------------------------");

        //solution3 Mixed ternaries and regular if statements

        String result3 = "";
        if (score >= 0 && score <= 100) {
           result3 = (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good"
                    : (score >= 60) ? "Passed" : "Failed";
        } else {
                result3 = "Invalid Score";
            }

            System.out.println(result3);

    }
}
