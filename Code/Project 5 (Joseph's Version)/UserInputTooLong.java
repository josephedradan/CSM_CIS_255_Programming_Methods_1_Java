public class UserInputTooLong extends Exception {
    public UserInputTooLong() {
        super("User Input is too long!");
    }

    public UserInputTooLong(String message) {
        super(message);
    }
}
