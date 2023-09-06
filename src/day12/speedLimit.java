package day12;

import java.util.Scanner;

public class speedLimit {
    public static void main(String[] args) {

        int speedLimit = 60;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Current speed:");
        int currentSpeed = input.nextInt();
        input.close();

        if (currentSpeed >= speedLimit) {
            System.out.println("You're driving " + currentSpeed + " mph over the limit. Slow down!");
        } else {
            System.out.println("Your speed "+currentSpeed + " mph ");
        }


    }
}/*Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105
            output:
            You're driving 50 mph over the limit. Slow down!
*/
