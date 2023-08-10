package types.java;

import java.util.Scanner;

public class LoopsInJava {
    public static void main(String[] args) {
        // For Loop in Java
        for (int i = 0; i < 5; i++) {
            System.out.println("for loop in java");
        }


        // while Loop in Java
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        // While Loop in Java with a break and continue statement
        while(true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();

            if(input.equals("pass"))
                continue; // Moves control to the beginning of the loop

            if (input.equals("quit"))
                break; // The break state terminate a loop

            System.out.println(input);
        }

        // Do While Loop in Java
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while(!input.equals("quit"));

        // Foreach Loop in Java
        String[] fruits = { "Apple", "Mango", "Banana" };

        for (var fruit: fruits) {
            System.out.println("Element: " + fruit);
        }
    }
}
