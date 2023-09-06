package day33.CircleTask;

public class Test {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(3.5);

        System.out.println(circle1.pi);//value of pi on circle1
        System.out.println(Circle.pi);// value of pi method Circle

        System.out.println(circle1);
        System.out.println(circle2);



        circle1.pi();// value of pi with method()
        circle2.pi();

    }
}
