package day31.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant KadonunYeri = new Restaurant("Kado", "Dayton", 5);
        Server server1 = new Server("Baho", 111, 5.5, true);
        Server server2 = new Server("Maho", 112, 7.5, true);
        Server server3 = new Server("Memo", 113, 6.5, false);
        Server[] servers = {server1,server2,server3};
        KadonunYeri.hireServers(servers);

        Chef chef1 = new Chef("Cano", 211, 15, true);
        Chef chef2 = new Chef("Balo", 212, 20, true);
        Chef chef3 = new Chef("Ashko", 213, 25, false);

        KadonunYeri.hireChef(chef1);
        KadonunYeri.chefs.addAll(Arrays.asList(chef2, chef3));


        KadonunYeri.terminateServer(111);
        KadonunYeri.terminateChef(213);
        System.out.println(KadonunYeri);
    }
}
/*
Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */