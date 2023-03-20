//Fairly specific type of Mammal and is adoptable.
public class Dog extends Mammal implements Adoptable {

    private boolean canPlayFetch;

    public Dog(String name, boolean canPlayFetch) {
        super(name);
        this.canPlayFetch = canPlayFetch;

        super.addOtherName("Canis Lupus Familiaris");
    }

    public Dog(String name) {
        this(name, true);
    }

    @Override
    public String getHomeCareInstructions() {
        String s = "When your dog reaches his first birthday, one meal a day is usually enough.\n" +
                "Before bathing, comb or cut out all mats from the coat. Your pet needs a warm,\n" +
                "quiet place to rest, away from all drafts and off the floor.\n";
        return s;
    }


}