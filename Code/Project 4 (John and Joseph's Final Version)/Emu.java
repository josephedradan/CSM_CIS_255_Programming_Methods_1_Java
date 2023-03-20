//Very specific type of bird that cannot fly.
public class Emu extends Bird {

    public Emu(String name) {
        super(name);

        super.addOtherName("Dromaius Novaehollandiae");
    }

    public boolean flies() {
        return false;
    }

}
