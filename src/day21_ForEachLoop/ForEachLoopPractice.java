package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        String first = "";
        String second = "";

        for (String word : words) {
            first = word.substring(0,1);
            second = word.substring(word.indexOf(" ")+1, word.indexOf(" ")+2);
            System.out.println(first+second);

        }

    }
}
