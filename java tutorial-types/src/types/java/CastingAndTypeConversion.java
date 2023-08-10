package types.java;

public class CastingAndTypeConversion {
    public static void main(String[] args) {
        // Implicit casting (Automatic Conversion)
        // byte -> short -> int -> long
        short x = 1;
        int y = x + 2;
        //System.out.println(y);

        // Explicit casting (Manual Conversion)
        double n = 1.1;
        int m = (int) (n + 2);
        System.out.println(m);


        String value = "1.1";
        double result = Double.parseDouble(value) + 2;
    }
}
