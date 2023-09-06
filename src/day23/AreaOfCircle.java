package day23;

public class AreaOfCircle {

    public static void main(String[] args) {

        areaOfCircle(10);

        System.out.println("----------------------");
        areaOfSquare(17);

    }


    //	6. create a method that can calculate the area of a circle
    public static void areaOfCircle(int radius) {
        double area = 3.14 * radius * radius;
        System.out.println("area = " + area);
    }


    //  7. create a method that can calculate the area of a square
    public static void areaOfSquare(int length) {
        int area = length * length;
        System.out.println("area = " + area);
    }

}
