package types.java;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name: ");
        String myAge = scanner.nextLine();

        System.out.println("You are: " + myAge);
    }
}
