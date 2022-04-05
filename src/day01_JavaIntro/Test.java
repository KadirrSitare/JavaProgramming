package day01_JavaIntro;

import day24_CustomMethod_Return.RemoveDuplicatedCharacters;
import day24_CustomMethod_Return.ReturnMethodIntro;
import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "aaaaaaaaaaaaaabbbbbbbbbbccccccccccddddd";
        str = RemoveDuplicatedCharacters.duplicatesRemoved(str);
        System.out.println(str);

        String name = "Java Programming";
        String reversed = ReturnMethodIntro.reverse(name);
        System.out.println(reversed);

        String str2 = "Wooden Spoon";
        StringUtility.printEachChar(str2);


    }
}
