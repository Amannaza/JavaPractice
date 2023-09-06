package day33.iphoneTask;

public class Test {
    public static void main(String[] args) {

        Iphone phone1 = new Iphone("Xmax", "grey", 20000, 14);

        System.out.println(phone1);

        phone1.call(666526834);
        phone1.texting(23742223);
        phone1.faceTime("ahfasjcisjf@ihf.com");
    }
}
