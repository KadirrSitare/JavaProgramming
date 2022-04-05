package replitTasks;

public class CombineStrings {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "cydeo";
        String str3 = mergeTwoStrings(str1, str2);

        System.out.println(str3);

    }

    public static String mergeTwoStrings(String str1, String str2){

        String merged = new String (str1);
        for (int i = 0; i < str2.length(); i++) {
            merged+= str2.charAt(i);
        }
        return merged;

    }
}
