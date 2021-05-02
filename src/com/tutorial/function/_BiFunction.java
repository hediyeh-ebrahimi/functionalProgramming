package com.tutorial.function;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {
        //Imperative
        System.out.println(multiple(3, 2));

        //Declarative
        BiFunction<Integer, Integer, Integer> multiple0 = (val1, val2) -> val1 * val2;
        System.out.println(multiple0.apply(3, 2));

    }

    public static int multiple(int val1, int val2) {
        return val1 * val2;
    }
}
