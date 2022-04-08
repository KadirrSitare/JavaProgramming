package day36.sports;

public class Football extends Sports{

    public int numberOfFans;

    public Football(String name, String rules, int numberOfPlayers, int numberOfReferee, int numberOfFans) {
        super(name, rules, numberOfPlayers, numberOfReferee);
        this.numberOfFans = numberOfFans;
    }

    public void usePenalty(){
        System.out.println(name + " used penalty");
    }
}
