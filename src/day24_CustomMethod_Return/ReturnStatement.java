package day24_CustomMethod_Return;

public class ReturnStatement {

    public static void main(String[] args) {

        nameOfTheDay(10);

    }

    public static void nameOfTheDay(int number) {

        if (number > 7 || number < 1) {
            System.out.println("Invalid");
            return; //exits nameOfTheDay method
        }
        String day = "";
        day = (number == 1) ? "Mon" : (number == 2) ? "Tue" : (number == 3) ? "Wed" : (number == 4) ? "Thu" : (number == 5) ? "Fri"
                : (number == 6) ? "Sat" : "Sun";

        System.out.println("Day name: " + day);

    }
}
