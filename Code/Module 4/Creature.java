// **************** CHECKOUT
// Question 12
// enum is like class Creatures but for constants
public enum Creature {

    HOBBIT(false), ELF(false), DRAGON(true);

    private boolean canFly;

    private Creature(boolean canFly) {
        this.canFly = canFly;
    }
    public boolean canFly() {
        return canFly;
    }

}

