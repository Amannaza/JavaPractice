package day14;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your mail address:");
        String email=input.next();

        input.close();

        String firstName=email.substring(0,email.indexOf("_"));
        String lastName=email.substring(email.indexOf("_")+1,email.lastIndexOf("@"));
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

        //char firstUppercase = Character.toUpperCase(firstName.charAt(0));
        //char secondUppercase = Character.toUpperCase(lastName.charAt(0));

        System.out.println("First name:"+firstName.substring(0,1).toUpperCase() + firstName.substring(1));
        System.out.println("Last name:"+lastName.substring(0,1).toUpperCase()+lastName.substring(1));
        System.out.println("Domain:"+domain);
    }
}
