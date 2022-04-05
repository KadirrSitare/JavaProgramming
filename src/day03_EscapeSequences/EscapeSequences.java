package day03_EscapeSequences;
/*
escape sequences: MUST be given with double quote.
\n : starts a new line
\t : paragraph space (tab)
\\ : single back slash
\" :double quote

 */
public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");
        System.out.println("---------------------------");
        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");
        System.out.println("---------------------------");
        System.out.println("\tJava is Cool Programming Language");
        System.out.println("---------------------------");
        System.out.println("One forward slash two backward slashes /\\\\");
        System.out.println("---------------------------");
        System.out.println("My favorite TV show is \"Game of Thrones\""); //in order to print ", we need to use \" escape sequence

    }
}
