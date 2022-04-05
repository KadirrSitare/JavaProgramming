package day24_CustomMethod_Return;

public class ReturnMethodsPractice {

    public static void main(String[] args) {
        int max = maxNumber(20, 50);
        System.out.println(max);

        int multiplication = max * 2;
        System.out.println(multiplication);
    }

    public static int maxNumber(int num1, int num2) {

        int result;
        if (num1 >= num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }


}
