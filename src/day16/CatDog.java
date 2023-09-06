package day16;

public class CatDog {
    public static void main(String[] args) {

        String str="Cat dog cat Dog  ";
        int numberDog=0;
        int numberCat=0;


        for (int i = 0; i <str.length()-2 ; i++) {

            String each=str.substring(i,i+3);
            if (each.equalsIgnoreCase("dog")){
                numberDog++;
            }
if (each.equalsIgnoreCase("cat")){
    numberCat++;
}
        }
boolean isEqual=numberCat==numberDog;

        System.out.println(isEqual);

    }
}
