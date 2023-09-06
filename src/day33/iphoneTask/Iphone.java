package day33.iphoneTask;

import javax.xml.namespace.QName;

public class Iphone {
    public String model, color;
    public double price, size;

    public static String brand = "Ipone", OS = "ios", madeIn = "Chine";

    public Iphone(String model, String color, double price, double size) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }

public void faceTime(long phoneNumber){
        System.out.println(model+" is doing face time with "+phoneNumber);
    }
public void faceTime(String email){
    System.out.println(model+" is doing face time with "+email);
}

public void call(long phoneNumber){
    System.out.println(model+" is calling "+phoneNumber);
}

public void texting(long phoneNumber){
        System.out.println(model+" is texting "+phoneNumber);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
/*4. IPhone Task:
		1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

*/