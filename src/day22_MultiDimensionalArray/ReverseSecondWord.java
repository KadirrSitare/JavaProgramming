package day22_MultiDimensionalArray;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String sentence = "I love Java do you love it?";
        String[] words = sentence.split(" ");
        String newSentence = "";

        for (String word : words) {
            String reversed = "";
            if (words[1].equals(word)) {
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed += word.charAt(i);
                }
                newSentence += reversed + " ";
                continue;
            }
            newSentence += word + " ";
        }
        System.out.println(newSentence);
    }
}
/*
Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
 */