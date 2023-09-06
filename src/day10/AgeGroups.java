package day10;

public class AgeGroups {
    public static void main(String[] args) {

/*Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )
             if age is negative or greater than 150, print invalid
             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
*/
        int age = -12;

        String result = "";

        boolean validGrade = age >= 0 && age <= 150;


        if (validGrade) {
            if (age < 21) {
                result = "Teeneger";
            } else if (age >= 21 && age < 55) {
                result = "Adult";
            } else {
                result = "Senior";
            }

        } else {
            result = "İnvalid";
        }
        System.out.println("result = " + result);


    }
}
