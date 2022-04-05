package day17_While_DoWhile;

import java.util.Scanner;

public class LogInMySolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scan.nextLine();
        System.out.println("Enter your password:");
        String password = scan.nextLine();

        int attempt = 3;

        while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempt > 0) {
            System.out.println("Incorrect username or password. Try again.");
            attempt--;
            System.out.println("Enter your username:");
            username = scan.nextLine();
            System.out.println("Enter your password:");
            password = scan.nextLine();
            if (attempt == 0) {
                System.out.println("Incorrect username or password. \nYour account has been locked.");
            }
        }
        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged in.");

        }
        scan.close();
    }
}
/*You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."



    	for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}

    	}

 */