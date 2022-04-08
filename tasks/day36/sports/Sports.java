package day36.sports;

public class Sports {

    public String name, rules;
    public int numberOfPlayers, numberOfReferee;

    public Sports(String name, String rules, int numberOfPlayers, int numberOfReferee) {
        this.name = name;
        this.rules = rules;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferee = numberOfReferee;
    }

    public void play(){
        System.out.println("You are playing " + name);
    }

    public String toString() {
        return "Sports{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                '}';
    }
}
/*
Sports Task:
	1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules



			methods:
				setInfo()
				play()
				toString()

		2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google

 */