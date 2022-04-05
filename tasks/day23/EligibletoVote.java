package day23;

public class EligibletoVote {

    public static void main(String[] args) {

eligibleToVote(18,"usa");


    }
    public static void eligibleToVote(int age, String citizenship){

        if (age>=18 && citizenship.equalsIgnoreCase("USA")){
            System.out.println("You are eligible to vote!");
        }else{
            System.out.println("You are not eligible to vote!");
        }
    }


}
//create a method that can check if a person is eligible to vote
//			Ex:
//				eligibleToVote(19, "USA");
//
//			output:
//				You are not eligible to vote!