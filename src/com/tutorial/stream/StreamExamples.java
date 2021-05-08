package com.tutorial.stream;

import java.math.BigInteger;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        Stream.iterate(0L, value -> 1L + value)
                .filter(value -> value < 10)
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);


        Stream.iterate(BigInteger.ONE,bigInteger -> bigInteger.multiply(BigInteger.ONE))
                .limit(5)
                .forEach(System.out::println);


    }
}
