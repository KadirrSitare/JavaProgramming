package day09_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int grade = 100;
        String report;

        if (grade>=90 && grade<=100){
            report = "Excellent";
        }else if (grade>=80 && grade<=89){
            report = "Great";
        }else if (grade>=70 && grade<=79){
            report = "Good";
        }else if (grade>=60 && grade<=69){
            report = "Passed";
        }else {
            report = "Failed";
        }
        System.out.println(report);
    }
}
