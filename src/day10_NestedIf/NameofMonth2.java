package day10_NestedIf;

public class NameofMonth2 {

    public static void main(String[] args) {

        int number = 1;

        String month = (number == 1) ? "january" : (number == 2) ? "february" : (number == 3) ? "march" : (number == 4) ? "april"
                : (number == 5) ? "may" : (number == 6) ? "june" : (number == 7) ? "july" : (number == 8) ? "august"
                : (number == 9) ? "september" : (number == 10) ? "october" : (number == 11) ? "november" : "december";

        System.out.println(month);

    }
}
