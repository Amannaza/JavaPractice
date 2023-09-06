package day23;

public class EligibleVote {

    public static void eligibleVote(int age,String country){

        if (age>=18&&country.equalsIgnoreCase("usa")){
            System.out.println("\t\t\t\tEligible for vote!");
        }else {
            System.out.println("\t\t\t\tYou are not eligible to vote! \n");
        }

    }



    public static void main(String[] args) {

        eligibleVote(18,"usA");

    }
}
