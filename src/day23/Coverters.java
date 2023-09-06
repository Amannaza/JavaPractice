package day23;

public class Coverters {
    public static void main(String[] args) {

        dolarToEuro(135);
        System.out.println("---------------");

        dolarToLira(145);
        System.out.println("---------------");

        kgToLb(150);
        System.out.println("----------------");

    }




    //	9. create a method that can convert dollar to euro
    public static void dolarToEuro(int dolar){
        double euro=0.96*dolar;
        System.out.println("euro = " + euro);
    }


    //	10. create a method that can can convert dollar to lira
    public static void dolarToLira(int dolar){
        double lira=18.12*dolar;
        System.out.println("Lira = " + lira);
    }

    //	11. create a method that can convert kg to lb
    public static void kgToLb(int kg){
        double lb=2.2046*kg;
        System.out.println("Lb= " + lb);
    }



}
