package shortVideosPractice;

import java.util.Scanner;

public class Next_Line {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score :");
        int score = input.nextInt();

        System.out.println("Enter your fullname :");
        input.nextLine();
        String name = input.nextLine();

        System.out.println("score = " + score);
        System.out.println("name = " + name);
    }
}
