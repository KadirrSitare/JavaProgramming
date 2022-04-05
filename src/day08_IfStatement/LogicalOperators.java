package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 19;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA"; //BOTH expressions must be true in order to get "true" result

        System.out.println(name + " is eligible to vote: " + isEligible);
        System.out.println("------------------------------------");

        String name2 = "Josh";

        int creditScore = 720;
        int age2 = 21;
        int income = 50000;
        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;

        System.out.println(name2 + " is eligible for loan: " + isEligible2);
        System.out.println("------------------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F'); // logical OR operator ||

        System.out.println(name3 + " is eligible to register: " + isEligible3);
        System.out.println("------------------------------------");

        String name4 = "Matt";

        String countryOfBirth = "UK";
        boolean MarriedToUSCitizen = false;
        boolean isEligible4 = countryOfBirth == "USA" || MarriedToUSCitizen == true;

        System.out.println(name4 + " is eligible to apply for US citizenship: " + isEligible4);
        System.out.println("------------------------------------");

        String name5 = "Anna";

        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(name5 + " is eligible for scholarship: " + isEligible5);

        System.out.println("------------------------------------");

        boolean result2 = true;
        boolean result3 = !result2; // logical NOT operator !
        System.out.println("result3 = " + result3);
        System.out.println("result2 = " + result2);

        int score = 55;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

    }
}
