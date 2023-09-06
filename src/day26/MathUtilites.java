package day26;

public class MathUtilites {



    //Create a method that can return the sum of two integers
    public static int sumOfTwo(int num1, int num2) {
        return num1 + num2;
    }


    //2.2 Create a method that can return the sum of two decimal numbers
    public static double sumOfTwo(double num1, double num2) {
        return num1 + num2;
    }


    //2.3 Create a method that can return the subtraction of two integers
    public static int subtractionOfTwo(int num1, int num2) {
        return num1 - num2;
    }


    //2.4 Create a method that can return the subtraction of two decimals
    public static double subtractionOfTwo(double num1, double num2) {
        return num1 - num2;
    }


    //2.5 Creata a method that can return the multiplication of two integers
    public static int multiplicationOfTwo(int num1, int num2) {
        return num1 * num2;
    }


    //2.6 Creata a method that can return the multiplication of two decimals
    public static double multiplicationOfTwo(double num1, double num2) {
        return num1 * num2;
    }


    //2.7 Create a method that passes two double parameters and return the division result
    public static double division(double num1, double num2) {
        return num1 / num2;
    }


    //2.8 Create a method that can check if an integer is even number
    public static boolean even(int number) {
        return (number % 2 == 0) ? true : false;
    }


    //2.9 Create a method that can check if an integer is odd number
    public static boolean odd(int number) {
        return (number % 2 != 0) ? true : false;
    }


    //2.10 Create a method that can return the maximum number between two integers
    public static int maxOfTwo(int num1, int num2) {

        return (num1 > num2) ? num1 : num2;
    }


    //2.10 Create a method that can return the maximum number between two decimal numbers
    public static double maxOfTwo(double num1, double num2) {

        return (num1 > num2) ? num1 : num2;
    }


    //2.12 Create a method that can return the minimum number between two integers
    public static int minOfTwo(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;
    }


    //2.13 Create a method that can return the minimum number between two decimal numbers
    public static double minOfTwo(double num1, double num2) {
        return (num1 < num2) ? num1 : num2;
    }


    //2.14 Create a method that can return the square of an integer
    public static int square(int number) {
        return number * number;
    }


    //2.15 Create a method that can return the square of a double
    public static double square(double number) {
        return number * number;
    }


    //2.16 Create a method that can return the cube of an integer
    public static int cube(int number) {
        return number * number * number;
    }


    //2.16 Create a method that can return the cube of an double
    public static double cube(double number) {
        return number * number * number;
    }


}
