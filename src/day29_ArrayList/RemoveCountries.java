package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountries {

    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada" };

        ArrayList<String> countriesList = new ArrayList<>(Arrays.asList(countries));

        countriesList.removeIf(p -> p.length()>=10 );

        countries = countriesList.toArray(new String[0]); // length of the array (0) does not matter, it will be replaced. But it is better to give 0 not to get null results.
        System.out.println(Arrays.toString(countries));




    }
}
/*
1. create an Array of string called countries

2. write a program that can remove all the country names that have length of 10 or greater
 */