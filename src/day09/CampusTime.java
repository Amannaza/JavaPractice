package day09;

public class CampusTime {
    public static void main(String[] args) {
        //Get the number between 1-24 which is hours of day
        int a = 24;

        boolean open = a >= 8 && a <= 23;

        if (open) {
            System.out.println("Open");
        } else {
            System.out.println("Closed");


        }
    }
}
