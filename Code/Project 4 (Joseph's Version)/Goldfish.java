public class Goldfish extends Fish implements Aquatic, Adoptable {

    public Goldfish(String name) {
        super(name);

        super.addOtherAnimalNames("Carassius auratus");
    }

    @Override
    public boolean canLiveOnLand() {
        return false;
    }

    @Override
    public String getHomeCareInstructions() {
        String Instructions = "\tGive gold boi sum gold flakes :)";
        return Instructions;
    }
}
