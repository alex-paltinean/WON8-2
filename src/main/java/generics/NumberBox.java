package generics;

public class NumberBox<I extends Number> {
    private I item;

    public NumberBox(I item) {
        this.item = item;
    }

    public I getItem() {
        return item;
    }

    public void setItem(I item) {
        this.item = item;
    }

    public boolean isPositive() {
        return item.intValue() > 0;
    }
}
