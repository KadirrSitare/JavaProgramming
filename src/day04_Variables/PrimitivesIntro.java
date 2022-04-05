package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
//age: 38 years old
        byte age = 38;
        //weight: 160 pounds
        //byte weight = 160; // 160 is out byte's range. (-128 to 127)
        //byte num = -129; // -129 is out byte's range. (-128 to 127)
        short weight = 160;

        //salary: 100000 $
        // short salary = 100000; // 100000 is out of short's range
        int salary = 100000; // int is the preferred data type for integer numbers

        long asset = 3_333_333_333L; /*
     long primitive type kullanmak icin sonuna L yada l include etmelisin
     yoksa bu sayiyi compiler integer olarak algilar. */

        //tax: 0.26
        double tax = 0.26; /*
     double is more preferred than float.
     For Float, you need to add F or f at the end of the number*/
        float taxes = 0.26f;

        // #
        char ch1 = '#'; //the char data type can be assigned within the single quotes
        char ch2 = 35; //the number you assign returns the character in the ASCII table
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

        char gender = 'M'; //if you use single character as a variable, you will choose char as a data type

        char grade = 'F';

        char yesNo = 'Y';
        boolean isMarried = true; //boolean: true or false
        boolean isEmployed = false;
        boolean result = 100 > 300;
        System.out.println("result = " + result);
        System.out.println("isEmployed = " + isEmployed);


        String name = "Tommy Hillfiger";
        String SSN = "(324)-234-6785";




    }
    

}
