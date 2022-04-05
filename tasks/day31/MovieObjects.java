package day31;
import java.util.Arrays;
import static java.util.Arrays.*;

public class MovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie("USA", "Journey to SDET: Cydeo Batch 25", "10/25/2021","Kuzzat Altay");

        movie1.Genre= "Adventure, Comedy, Thriller";
        String [] casts = {"Asiya", "Adam", "Muhtar","A","B", "C", "D", "E"};
        movie1.addCasts(casts);

        System.out.println(movie1);
    }
}
