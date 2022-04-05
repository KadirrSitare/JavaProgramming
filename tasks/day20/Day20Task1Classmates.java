package day20;

public class Day20Task1Classmates {

    public static void main(String[] args) {

        String[] classmates = {"John Walker", "Ali Gul", "Veli Kul", "Deli Bol", "Yale Unir", "Enis Naut", "Fatih Ay", "Crazy Mehmet", "Sultan Selim", "Muhtesem Sulu" };


        for (int i = 0; i < classmates.length; i++) {
            String initial1 = classmates[i].toUpperCase().charAt(0) + "";
            String initial2 = classmates[i].toUpperCase().charAt(classmates[i].indexOf(" ") + 1) + "";
            System.out.println(initial1 + initial2);
        }

    }
}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */