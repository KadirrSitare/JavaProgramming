package day09_IfStatements;

public class FieldTrip {

    public static void main(String[] args) {

        int gradeNumber = 3;
        int numberOfGroups = 0;
        String location = "";
        String teacherInCharge = "";


        if (gradeNumber == 1){
            location = "Apple orchard";
            numberOfGroups = 3;
            teacherInCharge = "Ms. Smith";
        }else if (gradeNumber == 2){
            location = "Zoo";
            numberOfGroups = 7;
            teacherInCharge = "Mr. Lee";
        }else if (gradeNumber == 3){
            location = "Aquarium";
            numberOfGroups = 5;
            teacherInCharge = "Ms. Wilson";
        }else if (gradeNumber == 4){
            location = "Movie Theater";
            numberOfGroups = 2;
            teacherInCharge = "Ms. Reyes";
        }else if (gradeNumber == 5){
            location = "Museum";
            numberOfGroups = 5;
            teacherInCharge = "Ms. Lela";
        }else {
            location = "Six Flags";
            numberOfGroups = 8;
            teacherInCharge = "Mr. Watt";
        }

        System.out.println("grade - " + gradeNumber + "\nlocation - " + location +
                "\nnumber of groups - " + numberOfGroups + "\nteacher in charge - " + teacherInCharge
        );
        //System.out.println("grade - " + gradeNumber + "/nlocation - " + location);

    }
}
/*
Create a class called FieldTrip. Your school goes on a Field trip each year. The place you go will be based on your grade. Given a variable gradeNumber (1-6) figure out the details of your field trip. Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */