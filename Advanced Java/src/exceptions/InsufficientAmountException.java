package exceptions;

public class InsufficientAmountException extends Exception {
    public InsufficientAmountException() {
        super("Insufficient amount in your account.");
    }

    public InsufficientAmountException(String message) {
        super(message);
    }
}
