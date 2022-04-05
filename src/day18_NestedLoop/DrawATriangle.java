package day18_NestedLoop;

public class DrawATriangle {

    public static void main(String[] args) {

        String str = "";

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
                //str += "* ";
            }
            System.out.println();
        }
    }
}
