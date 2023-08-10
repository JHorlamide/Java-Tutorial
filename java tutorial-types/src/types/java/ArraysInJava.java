package types.java;
import java.util.Arrays;

public class ArraysInJava {
    public static void main(String[] args) {
        // ---> Arrays <---
         int[] numbers = new int[5];

         numbers[0] = 1;
         numbers[2] = 3;
         numbers[4] = 5;
        System.out.println(Arrays.toString(numbers));

        // ---> New way of creating arrays in Java if we know the amount of items ahead of time <---
        int[] numberArray = { 1, 2, 3, 4, 5 };
        Arrays.sort(numberArray);
        System.out.println(Arrays.toString(numberArray));

        // --> Creating a two-dimensional array in java <--
         int[][] towDimArrayOfNum = { {1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(towDimArrayOfNum));
    }
}
