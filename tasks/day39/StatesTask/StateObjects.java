package day39.StatesTask;

public class StateObjects {

    public static void main(String[] args) {

        Florida florida = new Florida("Democrats","Arnold", "Hagi",1500454,2.5);
        Virginia virginia= new Virginia("Democrats","Mike", "Oscar",1520454,4.5);
        California california = new California("Republicans","Kilo", "Lima",785421,3.8);
        Texas texas = new Texas("Republicans","Sierra", "Tango",6548752,8.8);

        texas.setPopulation(100);
        california.setGovernor("Golf");
        System.out.println(texas + " " + california+ " "+ florida+ ""+virginia);



    }
}
