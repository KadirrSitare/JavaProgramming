package day24;

public class Task1FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "Java java java python python";
        String word = "java";
        int numOfWord = freqOfWord(sentence,word);
        System.out.println(numOfWord);

    }

    public static int freqOfWord(String sentence, String word) {

        String[] words = sentence.split(" ");
        int freq = 0;
        for (String each : words) {
            if (word.equalsIgnoreCase(each)) {
                freq++;
            }
        }
        return freq;
    }


}
/*
create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */


