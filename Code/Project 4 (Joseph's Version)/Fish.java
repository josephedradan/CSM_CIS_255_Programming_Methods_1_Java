public abstract class Fish extends Animal implements Aquatic {

    /*
    Some fish can be Terrestrial, cannot override canLiveOnLand here.
        Mudskipper

     */

    public Fish(String name) {
        super(name);

        super.addOtherAnimalNames("Gill-bearing Aquatic Craniate");
    }

    @Override
    public boolean isWarmBlooded() {
        return false;

    }
}
