package day23;

public class NameFormat {

    public static void main(String[] args) {

        nameFormat("johnnY", "dEEp");

    }
    public static void nameFormat(String firstName, String lastName){
        firstName = firstName.toUpperCase();
        firstName = firstName.substring(0,1) + firstName.substring(1).toLowerCase();
        lastName = lastName.toUpperCase();
        lastName = lastName.substring(0,1) + lastName.substring(1).toLowerCase();
        System.out.println(firstName +  " "+ lastName);
    }
}
/*
write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
 */