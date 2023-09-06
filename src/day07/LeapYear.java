package day07;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2020;
        int isLeapyear = year % 4;
//        int isLeapyear = year % 4==0;

        boolean result2 = isLeapyear == 0;  //true
        System.out.println(year + " is leap Year = " + result2);


    }

}
