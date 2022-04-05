package day23;

public class Anagram {

    public static void main(String[] args) {

        anagram("lis", "sile");

    }

    public static void anagram(String str1, String str2) {

        String result = str1 + " and " + str2 + " are NOT anagram";
        if (str1.length() == str2.length()) {
            int count = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (str2.contains(str1.charAt(i) + "")) {
                    count++;
                }
            }
            if (count == str1.length()) {
                result = str1 + " and " + str2 + " are anagram";
            }
        }
        System.out.println(result);
    }

}
/*SECOND WAY:
public static void anagram(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not anagram");
        }

    }
 */


/*
create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */