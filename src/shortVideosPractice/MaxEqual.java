package shortVideosPractice;

import java.util.Scanner;

public class MaxEqual {
    public static void main(String[] args) {
        /*Write a program that can print the maximum number between two numbers, if both are equal then print Equal
			Ex: n1= 100, n2 = 200;
			output: 200 is maximum number*/
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " is maximum number");
        } else if (n2 > n1) {
            System.out.println(n2 + " is maximum number");
        } else {
            System.out.println("Equal");
    }
            


        if (n1<n2) {
            System.out.println(n1 + " is maximum number");
        }
        if (n2<n1) {
            System.out.println(n2 + " is maximum number");
        }
        if (n1==n2) {
            System.out.println("Equal");
        }
    }
}

