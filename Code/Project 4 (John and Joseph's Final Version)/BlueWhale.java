//Very specific type of whale so it extends to Whale, which is a mammal that
//can live in water.
public class BlueWhale extends Whale {

    public BlueWhale(String name) {
        super(name);
        super.addOtherName("Balaenoptera Musculus");
    }
}
