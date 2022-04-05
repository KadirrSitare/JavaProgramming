package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String[] classmates = {"John Walker", "Ali Gul", "Veli Kul", "Deli Bol", "Yale Unir", "Enis Naut", "Fatih Ay", "Crazy Mehmet", "Sultan Selim", "Muhtesem Sulu"};

        for (String each : classmates) {
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            System.out.println(reverse);

        }


    }
}
