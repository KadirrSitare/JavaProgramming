package day36.sports;

public class Basketball extends Sports{

    public Basketball(String name, String rules, int numberOfPlayers, int numberOfReferee) {
        super(name, rules, numberOfPlayers, numberOfReferee);
    }

    public void score(){
        System.out.println(name + " scored");
    }
}
