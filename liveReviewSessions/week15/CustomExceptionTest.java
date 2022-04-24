package week15;

public class CustomExceptionTest {

    public static void main(String[] args) {

        int minutes = 60;
        System.out.println("Class is going on for "+ minutes+ " minutes");
        if (minutes>50) {
           // throw new InsufficientBalanceException();
            throw new CustomBreaktimeException("It is break time!");
        }
        System.out.println("Let's continue the class together "+ (50-minutes)+ " minutes");



    }
}
