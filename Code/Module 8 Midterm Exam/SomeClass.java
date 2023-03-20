public class SomeClass {
    private int myValue;

    public SomeClass() {
        myValue = 1;
    }

    public void changeValue(int newValue) {
        int updatedValue = newValue * myValue;
        myValue = updatedValue;
    }

}