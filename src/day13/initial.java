package day13;

import java.util.Scanner;

public class initial {
    public static void main(String[] args) {
        /*4. write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S
        Note: Pay attention to the example output*/

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the user name:");
        String name = input.next();

        System.out.println("Enter the user surname:");
        String surname = input.next();
        input.close();

        System.out.println(name.charAt(0) + "." + surname.charAt(0));
    }
}
