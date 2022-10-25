package org.fasttrackit;

import java.util.List;

public class TDD {
    public Integer find(List<Integer> list, Integer number) {
        if (list == null) {
            return -1;
        }
        return list.indexOf(number);
    }

    //isTrue(true)
    //isTrue(false)
    public boolean isTrue(boolean test1) {
        return test1;
    }

    //isTrue(true, true)
    //isTrue(true, false)
    //isTrue(false, true)
    //isTrue(false, false)
    public boolean isTrue(boolean test1, boolean test2) {
        return test1 && test2;
    }

    // (0, 1), (21, 22), (10, 5)
    public int doSomething(int a, int b) {
        if (a < b) {
            if (a > 20) {
                return a + b;
            } else {
                return a - b;
            }
        } else {
            return a * b;
        }
    }

}
