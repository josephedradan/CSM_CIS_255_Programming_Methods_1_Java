public class Cat extends Pet {

    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // this???
    @Override
    public void printVetAppointmentReminder() {

    }

    @Override
    public String toString() {
        return String.format("%s\nColor: %s",
                super.toString(),
                color);
    }

    @Override
    public boolean equals(Object Obj) {
        if (Obj instanceof Cat) {
            Cat otherCat = (Cat) Obj;

            if(!super.getName().equalsIgnoreCase(otherCat.getName())){
                return false;
            }
            if(!color.equalsIgnoreCase(otherCat.getColor())){
                return false;
            }
            if(super.getAge() != otherCat.getAge()){
                return false;
            }
            return true;
        }
        return false;
    }
}
