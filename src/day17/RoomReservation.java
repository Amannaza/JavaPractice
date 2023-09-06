package day17;

import java.util.Locale;
import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to reserve room?");
        String question = input.next();
        int total = 0;

        while (!(question.equalsIgnoreCase("yes") || question.equalsIgnoreCase("no"))) {
            System.out.println("Invalid answer.Please re-enter:");
            question = input.next();

        }

        if (question.equalsIgnoreCase("yes")) {

            System.out.println("Which type of room you want to reserve?");
            System.out.println("\t\tKing Bed == $120");
            System.out.println("\t\tQueen Bed == $100");
            System.out.println("\t\tSingle Bed == $80");

            String roomType = input.next().toLowerCase();
            input.nextLine();
            while (!(roomType.equals("king bed") || roomType.equals("queen bed") || roomType.equals("single bed"))) {
                System.out.println("Invalid room type.Please re-enter:");

                roomType = input.nextLine().toLowerCase();
            }
            total = (roomType.equals("king bed")) ? 120 : (roomType.equals("queen bed")) ? 100 : 80;
            System.out.println("Your total price for " + roomType + " is " + total + "$");

        } else {
            System.out.println("Have a nice day!");
        }
        input.close();


    }
}/*Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)
	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$
the program should be able to display the room he/she reserved and total price of the room.
(if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)*/
