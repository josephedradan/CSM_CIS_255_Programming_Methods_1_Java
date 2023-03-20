public class Emu extends Bird implements Terrestrial, Winged {

    public Emu(String name) {
        super(name);

        super.addOtherAnimalNames("Dromaius Novaehollandiae");
    }

    @Override
    public boolean Flies() {
        return false;
    }
}
