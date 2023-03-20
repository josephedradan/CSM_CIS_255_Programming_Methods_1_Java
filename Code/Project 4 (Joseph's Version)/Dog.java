public class Dog extends Mammal implements Terrestrial, Adoptable {

    public Dog(String name) {
        super(name);

        super.addOtherAnimalNames("Canis Lupus Familiaris");
    }

    @Override
    public String getHomeCareInstructions() {
        String instructions = "\tGive doggo belly rubs :)";
        return instructions;
    }
}
