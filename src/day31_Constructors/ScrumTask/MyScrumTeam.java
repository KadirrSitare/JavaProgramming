package day31_Constructors.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Ali", 141, "SDET", 75000);
        Tester tester2 = new Tester("Veli", 142, "QA Lead", 85000);
        Tester tester3 = new Tester("Deli", 143, "SDET", 80000);
        Tester tester4 = new Tester("Cumali", 144, "SE", 90000);

        Tester[] testers = {tester2, tester3, tester4};


        Developer developer1 = new Developer("Johnny", 151, "Dev Lead", 105000);
        Developer developer2 = new Developer("Penny", 152, "Frontend Dev", 120000);
        Developer developer3 = new Developer("Finny", 153, "Backend Dev", 95000);
        Developer developer4 = new Developer("Tony", 154, "Dev Lead", 125000);
        Developer developer5 = new Developer("Walker", 155, "Java Developer", 145000);

        Developer[] developers = {developer2, developer3, developer4, developer5};

        ScrumTeam scrumTeam1 = new ScrumTeam("Hans", "Abdul", "Chrisa", 14);

        scrumTeam1.addTester(tester1);
        scrumTeam1.addDeveloper(developer1);
        scrumTeam1.addTesters(testers);
        scrumTeam1.addDevelopers(developers);

        System.out.println(scrumTeam1);

        System.out.println("--------------------------------------------");
        System.out.println("Testers");
        for (Tester tester : scrumTeam1.testersList) {
            System.out.println(tester.name + " : " + tester.salary);
        }
        System.out.println("Developers");
        for (Developer developer : scrumTeam1.devopsList) {
            System.out.println(developer.name + " : " + developer.salary);
        }
        System.out.println("-----------------------------------------");

        scrumTeam1.removeTester(144);
        scrumTeam1.removeDeveloper(151);
        System.out.println(scrumTeam1);

    }
}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */