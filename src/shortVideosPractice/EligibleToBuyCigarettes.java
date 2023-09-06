package shortVideosPractice;

import java.util.Scanner;

public class EligibleToBuyCigarettes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        boolean eligible = age >= 18;

        //   System.out.println("Person is eligible to buy cigarettes:  " + isEligible);

        if (eligible) {
            System.out.println("Person is eligible to buy cigarettes : " );
        }

        if (!eligible) {
            System.out.println("Warning.Person can't buy cigarettes");


        }

    }
}
