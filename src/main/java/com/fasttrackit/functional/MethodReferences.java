package com.fasttrackit.functional;

import java.util.function.Function;

public class MethodReferences {
    public static void main(String[] args) {
//        printSomethingInACertainWay((s, p) -> s.toLowerCase());
//        printSomethingInACertainWay((s, p) -> s.toUpperCase());

        printSomething(s -> s.toLowerCase());
        printSomething(String::toLowerCase);
    }

    public static void printSomethingInACertainWay(MyFunction howToPrint) {
        // hello
        // another 100 lines of code
        System.out.println(howToPrint.transform("hello", "prefix"));
    }

    public static void printSomething(Function<String, String> howToPrint) {
        // hello
        // another 100 lines of code
        System.out.println(howToPrint.apply("hello"));
    }
}
