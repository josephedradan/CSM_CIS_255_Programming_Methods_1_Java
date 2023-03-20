public class UserInputContainsIllegalCharacter extends Exception {
    public UserInputContainsIllegalCharacter() {
        super("User input contains illegal character!");
    }

    public UserInputContainsIllegalCharacter(String message) {
        super(message);
    }
}
