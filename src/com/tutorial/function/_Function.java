package com.tutorial.function;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Imperative
        System.out.println(doubleValue(3));

        //Declarative
        Function<Integer, Integer> doubleValue0 = value -> value * 2;
        Integer res = doubleValue0.apply(3);
        System.out.println(res);

        Function<Integer, Integer> plus = value -> value + 1;
        Function<Integer,Integer> result = doubleValue0.andThen(plus);
        System.out.println(result.apply(5));



    }

    public static int doubleValue(int a) {
        return a * 2;
    }
}
