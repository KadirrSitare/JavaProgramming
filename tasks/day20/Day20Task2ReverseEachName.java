package day20;

public class Day20Task2ReverseEachName {

    public static void main(String[] args) {

        String[] classmates = {"John Walker", "Ali Gul", "Veli Kul", "Deli Bol", "Yale Unir", "Enis Naut", "Fatih Ay", "Crazy Mehmet", "Sultan Selim", "Muhtesem Sulu" };


        for (int j = 0; j < classmates.length; j++) {
            String name = classmates[j];
            String reversed = "";
            for (int i = classmates[j].length()-1; i >=0; i--) {
                reversed  += name.charAt(i);
            }
            System.out.print(reversed);
            System.out.println();
        }
    }
}
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */