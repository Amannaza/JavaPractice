package day17;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        int discountRate = 0;

        System.out.println("Enter your name:");
        String name = input.next();

        System.out.println("Enter your gender:");
        char gender = input.next().toLowerCase().charAt(0);
        while (!(gender == 'f' || gender == 'm')) {
            System.out.println("Please enter valid gender:");
            gender = input.next().toLowerCase().charAt(0);
        }
        System.out.println("Are you married?");
        String isMarried = input.next().toLowerCase();
        while (!(isMarried.equals("yes") || isMarried.equals("no"))) {
            System.out.println("Re-enter again.Are you married?");
            isMarried = input.next().toLowerCase();
        }
        System.out.println("How old are you?");
        int age = input.nextInt();
        while (!(age > 0 && age < 120)) {
            System.out.println("Please enter valid age:");
            age = input.nextInt();
        }

        System.out.println("How many miles are you driving in a day?");
        int miles = input.nextInt();
        while (!(miles > 5)) {
            System.out.println("Enter valid miles:");
            miles = input.nextInt();
        }
        System.out.println("Do you want full coverage or liability insurance?");
        String insurance = input.next();
        input.nextLine();

        System.out.println("Did you have accidents or claims?");
        String accident = input.next();
        while (!(accident.equals("yes") || accident.equals("no"))) {
            System.out.println("Re-enter please.Did you have accidents or claims?");
            accident = input.next();
        }

        System.out.println("Do you have anti-theft device?");
        String antiTheft = input.next();
        while (!(antiTheft.equals("yes") || antiTheft.equals("no"))) {
            System.out.println("Re-enter please.Do you have anti-theft device?");
            antiTheft = input.next();
        }

        if (insurance.equals("liability")) {
            if (age < 25) {
                result += 90;
            } else if (age >= 25) {
                result += 50;
            }

            if (miles <= 10) {
                result += 10;
            } else if (miles > 10 && miles <= 50) {
                result += 30;
            } else if (miles > 50) {
                result += 50;
            }

        }
        if (insurance.equals("full coverage")) {
            if (age < 25) {
                result += 160;
            }
        } else if (age >= 25) {
            result += 120;
        }
        if (miles <= 10) {
            result += 20;
        } else if (miles > 10 && miles <= 50) {
            result += 40;
        } else if (miles > 50) {
            result += 70;
        }

        if (antiTheft.equals("yes")) {
            discountRate += 0.05;
        }
        if (accident.equals("yes")) {
            discountRate -= 0.15;
        } else {
            discountRate += 0.10;
        }
        if (isMarried.equals("yes")) {
            discountRate += 0.05;
        }

        int totalPrice = result * (1 + discountRate);

        System.out.println("Name:" + name);
        System.out.println("Gender:" + gender);
        System.out.println("Age" + age);
        System.out.println("Married or Not:" + isMarried);
        System.out.println("Has anti-theft device:" + antiTheft);
        System.out.println("Has Accidents or Claims:" + accident);
        System.out.println("Insurance Type:" + insurance);
        System.out.println("Total Price is equal to:" + totalPrice);
        input.close();
    }
}
