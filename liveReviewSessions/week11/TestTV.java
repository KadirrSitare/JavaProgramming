package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTV {

    public static void main(String[] args) {
        TV samsung = new TV();

        System.out.println(samsung);
        samsung.turnOn();

        TV beko = new TV();
        beko.volumeLevel = 5;

        TV crea = new TV();
        crea.channelUp();

        ArrayList<TV> TVlist = new ArrayList<>(Arrays.asList(samsung, beko, crea));
        System.out.println(TVlist);
    }
}
