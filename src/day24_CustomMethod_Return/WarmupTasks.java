package day24_CustomMethod_Return;

public class WarmupTasks {

    public static void main(String[] args) {

        initials("JOHNNY", "DEEP");
        domainOfTheEmail("user@gmail.com");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {
            domainOfTheEmail(email);
        }
        nameOfTheMonth(15);
        nameOfTheDay(5);
        daysInAMonth(2);
        ageGroup(10);
    }

    public static void initials(String firstName, String lastName) {

        String initials = firstName.charAt(0) + "." + lastName.charAt(0);
        initials = initials.toUpperCase();
        System.out.println(initials);
    }

    public static void domainOfTheEmail(String email) {

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("Domain: " + domain);

    }

    public static void nameOfTheMonth(int number) {

        String monthName = "Invalid";
        if (number <= 12 && number >= 1) {
            monthName = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                    : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Nov" : "Dec";
        }
        System.out.println("Month name: " + monthName);
    }

    public static void nameOfTheDay(int number) {
        String day = "Invalid";
        if (number <= 7 && number >= 1) {
            day = (number == 1) ? "Mon" : (number == 2) ? "Tue" : (number == 3) ? "Wed" : (number == 4) ? "Thu" : (number == 5) ? "Fri"
                    : (number == 6) ? "Sat" : "Sun";
        }
        System.out.println("Day name: " + day);

    }

    public static void daysInAMonth (int month){

        int dayNumber = 0;
        if (month>=1 && month <=12){
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dayNumber = 31;
                case 4 : case 6 : case 9 : case 11 :
                    dayNumber = 30;
                case 2 :
                    dayNumber = 28;
            }
            System.out.println("Days in month "+ month + " is " + dayNumber);
        } else {
            System.out.println("Invalid entry");
        }


    }

    public static void ageGroup (int age){

        String group = "Invalid Entry";
        if (age>=0 && age<=120){
            if (age >=1 && age <=2){
                group = "infant";
            }else if (age >=3 && age <=5){
                group = "toddler";
            }else if (age >=6 && age <=9){
                group = "kid";
            }else if (age >=10 && age <=12){
                group = "pre-teen";
            }else if (age >=13 && age <=17){
                group = "teenager";
            }else if (age >=18 && age <=20){
                group = "young adult";
            }else if (age >=21 && age <=39){
                group = "adult";
            }else if (age >=40 && age <=49){
                group = "Young Middle-Aged Adult";
            }else if (age >=50 && age <=54){
                group = "Middle-Aged Adult";
            }else if (age >=55 && age <=64){
                group = "Very Young Senior Citizen";
            }else if (age >=65 && age <=74){
                group = "Young Senior Citizen";
            }else if (age >=75 && age <=84){
                group = "Senior Citizen";
            }else {
                group = "Old Senior Citizen";
            }
        }
        System.out.println("Age group = " + group);
    }

}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
	6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)


 */