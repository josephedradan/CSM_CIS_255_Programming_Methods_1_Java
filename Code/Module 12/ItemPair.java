public class ItemPair<T> {

    private T item1;
    private T item2;

    public ItemPair(T item1, T item2) {
        this.item1 = item1;
        this.item2 = item2;

    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public void setItem2(T item2) {
        this.item2 = item2;
    }

    public T getItem1() {
        return item1;
    }

    public T getItem2() {
        return item2;
    }

    @Override
    public String toString() {
        return String.format("Item 1: %s\nItem 2: %s",
                item1,
                item2);
    }

    public boolean sameItemsInPair() {
        if (item1.equals(item2)) {
            return true;
        }
        return false;
    }
}
