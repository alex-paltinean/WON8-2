package com.fasttrackit.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpressions {
    public static void main(String[] args) {
//        tryFunction(a -> a + 1);
//        tryFunction(a -> a * 10);

//        trySupplier(() -> "Hello");
//        trySupplier(() -> "World");

//        tryPredicate(i -> i < 10);
//        tryPredicate(i -> i % 2 == 0);

//        tryConsumer(s -> System.out.println(s.toUpperCase()));

        tryMultiple(
                () -> "FastTrack",
                String::length,
                number -> number > 5,
                number -> System.out.println("Greater than 5")
        );
    }

    public static void tryMultiple(
            Supplier<String> supplier,
            Function<String, Integer> transformer,
            Predicate<Integer> tester,
            Consumer<Integer> consumer) {
        String s = supplier.get();
        Integer integer = transformer.apply(s);
        if (tester.test(integer)) {
            consumer.accept(integer);
        } else {
            System.out.println("Not good");
        }
    }


    public static void tryConsumer(Consumer<String> consumer) {
        // 100 lines of code
        consumer.accept("something");
        // 100 lines of code
        consumer.accept("something else");
    }

    public static void tryPredicate(Predicate<Integer> integerTester) {
        int a = 22; // obtained from lines above
        if (integerTester.test(a)) {
            System.out.println("WON");
        } else {
            System.out.println("LOST");
        }
    }

    public static void trySupplier(Supplier<String> stringSupplier) {
        String s = stringSupplier.get();
        if (s.startsWith("H")) {
            System.out.println(s.toLowerCase());
        } else {
            System.out.println("Not starting with H");
        }
    }

    public static void tryFunction(Function<Integer, Integer> incrementor) {
        // 100 lines of code
        System.out.println(incrementor.apply(4));
        // 100 lines of code
    }
}
