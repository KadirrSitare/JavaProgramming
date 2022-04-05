package day09_IfStatements;

public class PassOrFail {
    public static void main(String[] args) {

        int score = 50;
        boolean passed = score >= 60;

        if (passed) {
            System.out.println("Congrats, you passed");
        }else {
            System.out.println("Failed");
        }

    }
}
