package day21;

import java.util.Arrays;

public class JavaAndPython {

    public static void main(String[] args) {

        String words = "java python java java python four times java";

        String [] word = words.split(" ");
        int javaCount=0;
        int pythonCount =0;

        for (String each : word) {
            if(each.equalsIgnoreCase("java")){
                javaCount++;
            }
            if(each.equalsIgnoreCase("python")) {
                pythonCount++;
            }
        }
        System.out.println("pythonCount = " + pythonCount);
        System.out.println("javaCount = " + javaCount);


    }
}
/*
Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */