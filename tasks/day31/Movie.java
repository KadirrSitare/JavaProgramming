package day31;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country, title, Genre, releaseDate, director;
    public ArrayList<String> casts = new ArrayList<>();


    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(String cast) {
        casts.add(cast);
    }

    public void addCasts(String[] castsArray) {
        casts.addAll(Arrays.asList(castsArray));
    }

    public String toString() {
        return "title = " + title +
                "\ncountry = " + country +
                "\ndirector = " + director +
                "\ngenre = " + Genre +
                "\nrelease Date = " + releaseDate +
                "\ncasts = " + casts.toString().substring(1, casts.toString().length() - 1);
    }
}
/*
Movie Task:

	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts
 */