
public abstract class Mammal extends Animal {

    /*
    Mammals can be Aquatic
    Mammals can be Winged
    Mammals can be Arial
    Mammals can be Terrestrial
     */

    public Mammal(String name) {
        super(name);

        super.addOtherAnimalNames("Vertebrate");
    }

    @Override
    public boolean isWarmBlooded(){
        return true;
    }
}
