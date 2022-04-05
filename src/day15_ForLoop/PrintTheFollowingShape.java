package day15_ForLoop;

public class PrintTheFollowingShape {

    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            for (int y = 1; y <= 6; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
 print the following shape:

				* * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
 */