package day42_Exceptions;

public class MorningWorkOut{

    public static void sleep(double seconds){
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void pushup(int pushup){
        for (int i = 1; i <=pushup ; i++) {
            System.out.print("\rPush-up "+ i);
            sleep(1.5);
        }
        System.out.println("\nPush ups completed");
    }
    public static void pullup(int pullup){
        for (int i = 1; i <=pullup ; i++) {
            System.out.print("\rPull-up "+ i);
            sleep(2.5);
        }
        System.out.println("\nPull ups completed");
    }
}
/*
MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each


			2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */