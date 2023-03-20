public class Turtle extends Reptile implements Aquatic {

    /*
    Not all turtles are adoptable
     */

    public Turtle(String name) {
        super(name);

        super.addOtherAnimalNames("Testudines");
    }

    @Override
    public boolean canLiveOnLand() {
        return true;
    }
}
