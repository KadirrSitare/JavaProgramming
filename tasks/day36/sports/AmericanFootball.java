package day36.sports;

public class AmericanFootball extends Sports{
    public AmericanFootball(String name, String rules, int numberOfPlayers, int numberOfReferee) {
        super(name, rules, numberOfPlayers, numberOfReferee);
    }

    public void kickThemAll(){
        System.out.println(name + " is kicking them all");
    }
}
