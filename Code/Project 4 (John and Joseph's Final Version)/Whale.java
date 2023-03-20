//A specific type of mammal but vague enough to have other subclasses of whales
//all whales live in water and cannot live on land.
public abstract class Whale extends Mammal implements WaterDweller {

    public Whale(String name){
        super(name);

        super.addOtherName("Cetacea");
    }

    @Override
    public boolean livesOnLand() {
        return false;
    }
}
