package olamide.com;

import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static double readNumberInput(String promptMessage, int min, int max) {
        double value;

        while (true) {
            System.out.print(promptMessage);
            value = scanner.nextDouble();

            if (value >= min && value <= max) {
                break;
            }

            System.out.println("Enter a number between " + min + " and " + max);
        }

        return value;
    }
}
