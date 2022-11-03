package optional;

import java.util.List;
import java.util.Optional;

public class Main {
    private String s = null;

    public Optional<String> getS() {
        return Optional.ofNullable(s);
    }

    public static void main(String[] args) {
        Optional<Integer> max = getMax(null);
        System.out.println(max.isPresent());
        Integer integer = max.orElse(-1);
        System.out.println(integer);
        if (max.isEmpty()) {
            System.out.println("No max");
        } else if (max.get() > 0) {
            System.out.println("Maximum is positive");
        }
        doSomething(null);
    }

    public static Optional<Integer> getMax(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Optional.empty();
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (i > max) {
                max = i;
            }
        }
        return Optional.of(max);
    }

    public static void doSomething(Optional<Integer> i) {
        if (i.isPresent()) {
            //something fancy
        }
    }
}
