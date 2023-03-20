public class NegativeNumberException extends Exception {
    public NegativeNumberException(String errorMessage) {
        super(errorMessage);
    }
    public NegativeNumberException() {
        System.out.println(this.getClass().getName());
    }
}
