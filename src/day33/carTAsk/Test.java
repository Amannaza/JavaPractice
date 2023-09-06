package day33.carTAsk;

public class Test {
    public static void main(String[] args) {

        Car car1=new Car("Togg","X15","Black",2023,8000);

        System.out.println(car1);

        car1.drive();

        System.out.println("car1.hasBattery = " + car1.hasBattery);
    }
}
