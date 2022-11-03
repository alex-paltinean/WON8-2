package generics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OldBox oldBox = new OldBox(12);
        System.out.println(oldBox.getItem());

        if (oldBox.getItem() instanceof String) {
            System.out.println(((String) oldBox.getItem()).length());
        }
        if (oldBox.getItem() instanceof Integer) {
            System.out.println((Integer) oldBox.getItem() > 10);
        }

        Box<String> box = new Box<>("Mike");
        System.out.println(box.getItem().length());

        Box<Integer> box1 = new Box<>(12);
        System.out.println(box1.getItem() > 10);

        Box<List<Integer>> listBox;

        NumberBox<Long> numberBox = new NumberBox<Long>(10L);

        Pair<Long, Double> pair = new Pair<>(10L, 23.2);
    }
}
