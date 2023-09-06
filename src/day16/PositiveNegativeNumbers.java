package day16;

import java.util.Scanner;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 5 numbers:");

        int positiveNumbers=0;
        int negaitiveNumbers=0;

        for (int i = 0; i <5 ; i++) {
            int number=input.nextInt();

            if (number>0){
                positiveNumbers++;
            } else if (number<0) {
                negaitiveNumbers++;
            }

        }
        System.out.println("Negaitive Numbers : " + negaitiveNumbers);;
        System.out.println("Positive Numbers : " + positiveNumbers);


    }}
