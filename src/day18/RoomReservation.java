package day18;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int result = 0;
        int price = 0;


        while (true) {
            System.out.println("Which bedroom do you want to reserve?");

            System.out.println("            King Bed ==> 120$\n" + "            Queen Bed ==> 100$\n" + "            single Bed ==> 80$\n");


            String roomType = input.nextLine().toLowerCase();

            while (!(roomType.equals("king bed") || roomType.equals("queen bed") || roomType.equals("single bed"))) {


                System.out.println("            King Bed ==> 120$\n" + "            Queen Bed ==> 100$\n" + "            single Bed ==> 80$\n");

                System.out.println("There is no like that room type.Enter room type you want reserve:");

                roomType = input.nextLine().toLowerCase();
            }

            price = (roomType.equals("king bed")) ? 120 : (roomType.equals("queen bed")) ? 100 : 80;


            System.out.println("How many nights do you want reserve?");
            int night = input.nextInt();

            System.out.println("Would you like to reserve another room?");
            String another = input.next().toLowerCase();

            while (!(another.equals("yes") || another.equals("no"))) {
                System.out.println("Please enter valid answer.Would you like to reserve another room?");
                another = input.next().toLowerCase();
            }


            if (another.equals("no")) {

                result = price * night;

                System.out.println("Total price for " + roomType + " room type " + night + " nights is " + result + "$.");

                break;

            }

            input.nextLine();

        }

        input.close();
    }

}
