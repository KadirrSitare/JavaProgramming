package day24_CustomMethod_Return;

public class RemoveDuplicatedCharacters {

    public static void main(String[] args) {

        String str = "aaaaaaaaaaaabbbbcccccccdddddddddddhhhhhhhhhaaaaaaaaa";
        String uniqueCharacters = duplicatesRemoved(str);
        System.out.println(uniqueCharacters);


    }
    public static String duplicatesRemoved(String str){
        char[] str1 = str.toCharArray();
        String removed = "";
        for (char each : str1) {
            if (!removed.contains(each+"")){
                removed += each+"";
            }
        }
        return removed;
    }


}
/*
create a method that can remove duplciated characters from a string and returns the new value
					"aaabbcccc" ===> "abc"
 */