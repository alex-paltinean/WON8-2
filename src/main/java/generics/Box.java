package generics;

public class Box<I> {
    private I item;

    public Box(I item) {
        this.item = item;
    }

    public I getItem() {
        return item;
    }

    public void setItem(I item) {
        this.item = item;
    }
}
