public class Bat extends Mammal implements Arial, Winged {

    public Bat(String name) {
        super(name);

        super.addOtherAnimalNames("Chiroptera");
    }

    @Override
    public boolean Flies() {
        return true;
    }

}
