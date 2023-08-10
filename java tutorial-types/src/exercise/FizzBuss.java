package exercise;

import java.util.Scanner;

public class FizzBuss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        if((number % 5 == 0) && (number % 3 == 0)) {
            System.out.println("FizzBuss");
        }

        else if (number % 5 == 0) {
            System.out.println("Fizz");
        }

        else if (number % 3 == 0) {
            System.out.println("Buss");
        }

        else System.out.println(number);
    }
}
