package day11;

public class CydeoBatches {
    public static void main(String[] args) {
String batch = "sld";

/*if (batch=="US morning"){
    System.out.println("Class times are 10-5 EST. M, T, Th, F.");
} else if (batch=="US evening") {
    System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
} else if (batch=="EU") {
    System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
}else {
    System.out.println("Invalid Batch");*/
        System.out.println("--------------------------------------------");

if (batch=="US morning"||batch=="US evening"||batch=="EU"){
    switch (batch){
    case "US morning":
        System.out.println("Class times are 10-5 EST. M, T, Th, F.");
        break;
    case "US evening":
        System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
        break;
    case "EU":
        System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
        break;}
}else {
    System.out.println("Invalid batch");
}
}



    }

/*Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.
        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"
        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed*/