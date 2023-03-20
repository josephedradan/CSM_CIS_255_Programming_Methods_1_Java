//Many types of species of birds so it must be abstract, still an animal and all bird
//have wings and is always warm blooded.
public abstract class Bird extends Animal implements Winged {

    //Since all birds are warm blooded the bloodtype is set to true by calling
    //this superclasses constructor to set any subclasses to inherit this attribute.
    public Bird(String nameOfAnimal) {
        super(true, nameOfAnimal);

        super.addOtherName("Ave");
    }
}
