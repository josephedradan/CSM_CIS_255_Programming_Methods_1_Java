//Very specific animal that is a mammal and has wings which can fly.
public class Bat extends Mammal implements Winged {

    public Bat(String name) {
        super(name);

        super.addOtherName("Chiroptera");
    }

    @Override
    public boolean flies() {
        return true;
    }
}
