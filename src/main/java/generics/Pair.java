package generics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Pair<F extends Number, S extends Number> {
    private final F first;
    private final S second;

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
