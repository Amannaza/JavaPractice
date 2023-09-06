package day13;

import java.util.Scanner;

public class calledTravel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;

        System.out.println("Do you have valid passport?(yesOrNo)");
        String validPassport = input.next().toLowerCase();
        if (validPassport.equals("yes")) {
            int baseCostTicket = 1000;
            result += baseCostTicket;

            System.out.println("Enter your country name:");
            input.nextLine();
            String nameOfCountry = input.nextLine();

            System.out.println("How many bags will you have with you?");
            byte numberOfBags = input.nextByte();
            int bagCost = numberOfBags * 50;
            result += numberOfBags;
            int peopleDiscount;

            System.out.println("Enter peoples name travelling with you:");
            String peopleYouTravellingWith = input.next();

            System.out.println("Ask the user how many people they will travel with? (short)");
            short numberOfPeople = input.nextShort();

            if (numberOfPeople < 3) {
                result -= numberOfPeople * 100;
            } else {
                result -= 300;

            }
            System.out.println("Your ticket is booked " + nameOfCountry + " .We have charged extra for the " + numberOfBags +
                    " bags but you are traveling with " + peopleYouTravellingWith + " so we are giving a discount." +
                    " Your total cost is " + result + ".");
        }else {
            result=200;

            System.out.println("Enter when passport expired date(int):");
            int expiredDateYear=input.nextInt();

            result-=75*(2022-expiredDateYear);

            System.out.println("which country yo plan to travel:");
            String countryTravel=input.next();

            System.out.println("Are you will be traveling in the next year (String - yes or no):");
            String areTheyTravellingNextYear=input.next().toLowerCase();

            if (areTheyTravellingNextYear.equals("yes")){
                result+=100;
            }else {
                result-=50;
            }
            System.out.println("Looks like your passport has been expired for "+expiredDateYear+", but not to worry we will get it ready for you to travel to "+countryTravel+". Your total cost has come out to $"+result+".");


        }
        input.close();

    }
}