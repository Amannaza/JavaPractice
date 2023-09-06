package day09;

public class OxygenTank {
    public static void main(String[] args) {
        /*Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY*/

        int num = 1784;
        String level = "";


        if (num > 90&&num<=100) {
            level = "Your tank is full";

        } else if (num > 80 && num <= 90) {
            level = "Still Okay";
        } else if (num > 70 && num <= 80) {
            level = "Don't go too far";
        } else if (num > 60 && num <= 70) {
            level = "Start to head back";
        } else if (num >= 0 && num <= 60) {
            level = "Be careful now you at %50";
        } else {
            level = "There is problem on you tank level controller";
        }

        System.out.println(level);
    }
}
