//Very specific type of fish and can be adoptable.
public class Goldfish extends Fish implements Adoptable, WaterDweller {

    private String colorOfScales;

    public Goldfish(String name, String colorOfScales) {
        super(name);

        super.addOtherName("Carassius Auratus");
    }

    public Goldfish(String name) {
        this(name, "Gold");
    }

    public String getColorOfScales() {
        return colorOfScales;
    }

    @Override
    public String getHomeCareInstructions() {
        String s = "Considered cold water fish, goldfish can also be kept in heated aquariums.\n" +
                "Goldfish are omnivores, feeding largely on crustaceans, insects and plant matter\n" +
                "in the wild. A combination of Aqueon Goldfish Flakes,\n" +
                "Goldfish Granules and Goldfish Color Granules will provide a high quality diet.\n";

        return s;
    }

    @Override
    public boolean livesOnLand() {
        //Most fish cannot live on land.
        return false;
    }

}
