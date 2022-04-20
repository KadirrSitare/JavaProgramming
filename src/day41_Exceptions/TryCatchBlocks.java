package day41_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Hello world");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Paused for 5 seconds");


    }
}
