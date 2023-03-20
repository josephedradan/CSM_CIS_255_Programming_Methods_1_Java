public abstract class Bird extends Animal {

    /*
        Penguins are Aquatic Birds

        Not all birds have wings:
            Penguin (Flappers)

        Not all birds can fly:
            Penguin
    */

    public Bird(String name) {
        super(name);

        super.addOtherAnimalNames("Ave");
    }


    @Override
    public boolean isWarmBlooded() {
        return true;
    }
}