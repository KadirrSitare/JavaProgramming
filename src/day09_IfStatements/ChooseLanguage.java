package day09_IfStatements;

public class ChooseLanguage {
    public static void main(String[] args) {

        int selection = 3;
        String message;

        if (selection == 1) {
            message = "Hello, thank for your call";
        } else if (selection == 2) {
            message = "Hola, gracias para llamar";
        } else if (selection == 3) {
            message = "Merhaba, aradiginiz icin tesekkurler";
        } else if (selection == 4) {
            message = "Privet, spasibo za vash zvonok";
        } else {
            message = "Merci ,pour votre appel";
        }
        System.out.println(message);
        }
    }
/*
Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
 */