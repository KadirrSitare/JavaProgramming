package day11_Switch_Scanner;

public class CydeoBatches {

    public static void main(String[] args) {

        String batchType = "EU";
        String message = "";

        switch (batchType) {
            case "US morning":
                message = "Car times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                message = "Car times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                message = "Car times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                message = "Invalid Batch";
        }
        System.out.println(message);

    }
}
/*
 Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Car times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Car times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Car times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */