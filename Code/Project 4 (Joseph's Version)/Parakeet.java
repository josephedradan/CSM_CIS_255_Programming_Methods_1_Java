public class Parakeet extends Bird implements Arial, Winged, Adoptable {

    /*
    Not all Parakeets are adoptable... But whatever...
     */

    public Parakeet(String name) {
        super(name);

        super.addOtherAnimalNames("Melopsittacus undulatus");
    }

    @Override
    public String getHomeCareInstructions() {
        String Instructions = "\tGive birdo da food :)";
        return Instructions;
    }

    @Override
    public boolean Flies() {
        return true;
    }
}
