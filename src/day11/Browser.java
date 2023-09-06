package day11;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Browser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String browserName = input.next();

        switch (browserName) {
            case "chrome":
                System.out.println("Browser Name is Chrome");
                break;
            case "firefox":
                System.out.println("Browser Name is Firefox");
                break;
            case "safari":
                System.out.println("Browser Name is Safari");
                break;
            case "edge":
                System.out.println("Browser Name is Edge");
                break;
            case "opera":
                System.out.println("Browser Name is Opera");
                break;
            default:
                System.out.println("Invalid Browser");
        }


    }
}
/* write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser*/