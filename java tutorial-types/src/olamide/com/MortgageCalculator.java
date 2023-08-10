package olamide.com;

public class MortgageCalculator {
    private final byte MONTH_IN_YEARS = 12;
    private final int principal;
    private final float annualInterest;
    private final byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateMortgage() {
        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double calculateBalance(short numberOfPaymentMade) {
        short numberOfPayments = getNumberOfPayments();
        float monthlyInterest = getMonthlyInterest();

        return principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments)
                - Math.pow(1 + monthlyInterest, numberOfPaymentMade))
                / (Math.pow(1+ monthlyInterest, numberOfPayments) - 1);
    }

    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++) {
            balances[month - 1] = calculateBalance(month);
        }

        return balances;
    }

    private float getMonthlyInterest() {
        byte PERCENT = 100;
        return annualInterest / PERCENT / MONTH_IN_YEARS;
    }

    private short getNumberOfPayments() {
        return (short) (years * MONTH_IN_YEARS);
    }
}
