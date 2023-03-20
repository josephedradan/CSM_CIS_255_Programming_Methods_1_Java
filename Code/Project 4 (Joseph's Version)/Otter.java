public class Otter extends Mammal implements Terrestrial, Aquatic {

    public Otter(String name) {
        super(name);

        super.addOtherAnimalNames("Lutrinae");
    }

    @Override
    public boolean canLiveOnLand() {
        return true;
    }

}
