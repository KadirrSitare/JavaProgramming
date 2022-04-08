package day36.sports;

public class Baseball extends Sports{
    public Baseball(String name, String rules, int numberOfPlayers, int numberOfReferee) {
        super(name, rules, numberOfPlayers, numberOfReferee);
    }

    public void hit(){
        System.out.println(name + " hit the ball");
    }
}
