package day23;

public class CalculateGrade {

    public static void main(String[] args) {

        calculateGrade(90);

    }

    public static void calculateGrade(int number) {

        String grade = "Invalid";
        if (number >= 0 && number <= 100) {
            grade = (number >= 90) ? "A" : (number >= 80) ? "B" : (number >= 70) ? "C" : (number >= 60) ? "D" : "E";
        }
        System.out.println("Your grade is " + grade);
    }


}
