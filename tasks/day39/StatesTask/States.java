package day39.StatesTask;

public class States {

    private final String name, abbreviation;
    private String politicalParty, Governor, senator;
    private int population;
    private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        if (name==null || name.isBlank()||name.isEmpty()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;

        if (abbreviation==null || abbreviation.isBlank()||abbreviation.isEmpty()){
            System.err.println("Invalid abbreviation");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public String getSenator() {
        return senator;
    }

    public int getPopulation() {
        return population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty==null || politicalParty.isBlank()||politicalParty.isEmpty()){
            System.err.println("Invalid Political Party");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public void setGovernor(String governor) {
        if (governor==null || governor.isBlank()||governor.isEmpty()){
            System.err.println("Invalid Governor");
            System.exit(1);
        }
        Governor = governor;
    }

    public void setSenator(String senator) {
        if (senator==null || senator.isBlank()||senator.isEmpty()){
            System.err.println("Invalid Senator");
            System.exit(1);
        }
        this.senator = senator;
    }

    public void setPopulation(int population) {
        if(population<=0){
            System.err.println("Invalid population");
            System.exit(1);
        }
        this.population = population;
    }

    public void setStateTax(double stateTax) {
        if(stateTax<0){
            System.err.println("Invalid state tax");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}

/*
1. Create a class named States:
			variables:
				name, abbreviation, politicalParty, Governor, senator, population, stateTax

			Encapsulate all the fields

			Add a constructor that can set all the fields

						Conditions:
							1. name, abbreviation, politicalParty, Governor, and senator can not be null
							2. name, abbreviation, politicalParty, Governor, and senator can not be empty
							3. taxRate can not be negative
							4. Population can not be set to zero or negative

			Methods:
				toString()


	2. Create the following sub classes of States and add any additional fields and methods if necessary:
				1. Virginia
				2. California
				3. Texas
				4. Florida


	3. Create a class named StateObjects
					Create the objects of each sub classes

					test all the functions of each objects

            		Analyze the relationships between the classes
 */