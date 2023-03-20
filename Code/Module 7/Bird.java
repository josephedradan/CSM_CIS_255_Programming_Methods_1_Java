public class Bird extends Pet {
    private boolean canSing;

    public Bird(String name, int age, boolean canSing) {
        super(name, age);
        this.canSing = canSing;
    }

    public boolean getCanSing() {
        return canSing;
    }

    public void setCanSing(boolean canSing) {
        this.canSing = canSing;
    }

    @Override
    public void printVetAppointmentReminder() {

    }
}
