package types.java;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        String formattedCurrency = NumberFormat
                .getCurrencyInstance()
                .format(1234567.89);

        System.out.println(formattedCurrency);

        final String formattedPercent = NumberFormat
                .getPercentInstance()
                .format(0.1);

        System.out.println(formattedPercent);
    }
}
