//turtle is an animal that is a pecific type of reptile that can also live on water.
//and can also be adopted.
public class Turtle extends Reptile implements WaterDweller, Adoptable {

    public Turtle(String name) {
        super(name);

        super.addOtherName("Testudines");

    }

    @Override
    public boolean livesOnLand() {
        return true;
    }

    @Override
    public String getHomeCareInstructions() {
        String s = "House your turtle in the largest possible enclosure.\n" +
                "Cover the bottom of the tank with peat moss or soil.\n" +
                "Make a basking area for your turtle. Feed your turtle 3\n" +
                "to 4 times per week.\n";

        return s;
    }

}
