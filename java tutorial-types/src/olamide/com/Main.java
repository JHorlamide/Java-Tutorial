package olamide.com;

public class Main {
    public static void main(String[] args) {
        int principal = (int) Console
                .readNumberInput("Principal ($1K - $1M): ", 1_000, 1_000_000);

        float annualInterest = (float) Console
                .readNumberInput("Annual Interest Rate: ", 1, 30);

        byte years = (byte) Console.readNumberInput("Period (Years): ", 1, 30);

        var mortgage = new MortgageCalculator(principal, annualInterest, years);
        var report = new MortgageReport(mortgage);

        report.printMortgage();
        report.printPaymentSchedule();
    }
}
