//Very specific type of bird that can fly and is obviously winged. So flies()
//returns true.
public class Parakeet extends Bird implements Adoptable {

    public Parakeet(String name) {
        super(name);

        super.addOtherName("Melopsittacus Undulatus");
    }

    @Override
    public String getHomeCareInstructions() {
        String s = "Feed your parakeet bird seeds and pellet blends as well as veggies and" +
                   "fruits.\n" + "Your parakeet must stay within a 16x14x18 cage with toys and swings." +
                   "\nOffer baths with a spray bottle 2-3 times a week or a refreshing misting spray bottle";


        return s;
    }

    public boolean flies() {
        return true;
    }
}
