public abstract class Whale extends Mammal implements Aquatic {

    public Whale(String name) {
        super(name);

        super.addOtherAnimalNames("Cetacea");
    }

    @Override
    public boolean canLiveOnLand() {
        return false;
    }
}
