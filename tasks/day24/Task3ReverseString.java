package day24;

public class Task3ReverseString {

    public static void main(String[] args) {

String reverse = reverseString("Java");
        System.out.println(reverse);

    }
    public static String reverseString(String str){

String reversed= "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed;

    }


}
/*
create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ
 */