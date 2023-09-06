package day12;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter mile:");
        int miles=input.nextInt();

        input.close();

        double km=miles*1.6;

        System.out.println(miles +" is equal to "+km+" kilometers" );



    }
}/*Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0
                output:
                10.0 miles equal to 16.09 kilometers
*/
