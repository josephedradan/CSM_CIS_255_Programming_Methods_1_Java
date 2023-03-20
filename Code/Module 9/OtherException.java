public class OtherException extends Exception {
    public OtherException(String errorMessage) {
        super(errorMessage);
    }
    public OtherException() {
        System.out.println(this.getClass().getName());
    }
}
