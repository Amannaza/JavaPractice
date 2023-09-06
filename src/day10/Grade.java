package day10;

public class Grade {
    public static void main(String[] args) {

        /*Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT*/

        char ch = 'B';
        String result = "";

        // boolean validGrade = (grade >= 'A' && grade <= 'D') || grade == 'F';

        if (ch == 'A') {
            result = "excellent";
        } else if (ch == 'B') {
            result = "great job";
        } else if (ch == 'C') {
            result = "good";
        } else if (ch == 'D') {
            result = "passed";
        } else if (ch == 'F') {
            result = "failed";
        } else {
            result = "invalid";
        }
        System.out.println("result = " + result);

    }
}
