//An AnimalClass which is always cold blooded
public abstract class Reptile extends Animal {

    //Since all reptiles are cold blooded the bloodtype is set to true by calling
    //this superclasses constructor to set any subclasses to inherit this attribute.
    public Reptile(String nameOfAnimal) {
        super(false, nameOfAnimal);

        super.addOtherName("Tetrapod");
    }
}
