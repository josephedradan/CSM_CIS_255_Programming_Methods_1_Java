public class UserInputEmpty extends Exception {
    public UserInputEmpty() {
        super("User Input is Empty!");
    }

    public UserInputEmpty(String message) {
        super(message);
    }
}
