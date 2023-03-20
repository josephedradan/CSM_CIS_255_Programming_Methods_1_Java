public abstract class Reptile extends Animal implements Terrestrial {

    public Reptile(String name) {
        super(name);

        super.addOtherAnimalNames("Tetrapod");
    }

    @Override
    public boolean isWarmBlooded() {
        return false;
    }
}
