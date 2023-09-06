package day14;

import java.util.Scanner;

public class calledEmailTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your mail addres:");
        String name = input.next();

        input.close();
        String result = "";

        String nameFirstPart = name.substring(0, name.indexOf("_"));
        String nameLast = name.substring(name.indexOf("_") + 1, name.indexOf("@"));
        String rest = name.substring(name.indexOf( "@"));

        result = nameLast + "_" + nameFirstPart + rest;

        System.out.println(result);
    }
}
