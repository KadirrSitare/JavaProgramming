package replitTasks;

import java.util.*;

public class CopyCertainValues {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));
    }
    public static String[] getWithE(String[] arr) {

        int count = 0;
        for (String each : arr) {
            if (each.toLowerCase().contains("e")) {
                count++;
            }
        }
        String[] fewValues = new String[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].toLowerCase().contains("e")){
                fewValues[j]= arr[i];
                j++;
            }
        }
        return fewValues;
    }
}
