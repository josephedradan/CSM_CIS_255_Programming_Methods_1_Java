//An AnimalClass that is an animal that just dwells in water so must
//so must be abstract. All fish cannot live on land. Always cold blooded.
public abstract class Fish extends Animal implements WaterDweller {

    //Mudskiuppers can live on land.

    //Since all fish are cold blooded the bloodtype is set to true by calling
    //this superclasses constructor to set any subclasses to inherit this attribute.
    public Fish(String nameOfAnimal) {
        super(false, nameOfAnimal);

        super.addOtherName("Gill-bearing Aquatic Craniate");
    }


}
