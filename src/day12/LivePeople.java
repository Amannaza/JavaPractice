package day12;

import java.util.Scanner;

public class LivePeople {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberPeople = input.nextInt();
        input.close();

        if (numberPeople < 3) {
            System.out.println("Live with less than 3 people ");
        } else if (numberPeople >= 3 && numberPeople <= 6) {
            System.out.println("Live with 3 - 6 people");
        } else if (numberPeople > 6) {
            System.out.println("Live with more than 6 people");
        }


    }
}
/*Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"*/