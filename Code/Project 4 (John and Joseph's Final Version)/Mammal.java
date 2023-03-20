//AnimalClass that's an animal that is warmblooded always.
public abstract class Mammal extends Animal {

    //Since all mammals are warm blooded the bloodtype is set to true by calling
    //this superclasses constructor to set any subclasses to inherit this attribute.
    public Mammal(String nameOfAnimal) {
        super(true, nameOfAnimal);

        super.addOtherName("Vertebrate");
    }

}
