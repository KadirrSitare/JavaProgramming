package day23;

public class Calculator {

    public static void main(String[] args) {

        calculator(10,"*",5);

    }
   public static void calculator(double num1, String mathOperator, double num2){

        if (mathOperator == "+" || mathOperator == "-" ||mathOperator == "/" ||mathOperator == "*" ){
            double result = (mathOperator== "+")? num1+num2 : (mathOperator== "-")? num1-num2 :(mathOperator== "/")? num1/num2 : num1*num2;
            System.out.println(num1 + " "+mathOperator+ " "+ num2 + " = "+ result);

        }else {
            System.out.println("Invalid entry");
        }

   }




}
/*
create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result

 */