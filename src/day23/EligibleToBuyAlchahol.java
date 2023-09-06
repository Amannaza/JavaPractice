package day23;

public class EligibleToBuyAlchahol {

    public static void main(String[] args) {


        eligibleBuyAlchahol(15);
    }


    //	3. create a method that can check if a person is eligible to buy alcohol
    public static void eligibleBuyAlchahol(int age) {
        if (age >= 21) {
            System.out.println("Eligible.You can buy alchahol");
        } else {
            System.out.println("You can't buy alchahol");
        }


    }
}