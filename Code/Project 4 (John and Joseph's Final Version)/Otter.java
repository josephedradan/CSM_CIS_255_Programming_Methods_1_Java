//Very specific type of mammal and that lives on water
//but can also live on land.
public class Otter extends Mammal implements WaterDweller {

    public Otter(String name) {
        super(name);

        this.addOtherName("Lutrinae");
        this.addOtherName("Enhydra Lutris");
    }

    @Override
    public boolean livesOnLand() {
        return true;
    }

}
