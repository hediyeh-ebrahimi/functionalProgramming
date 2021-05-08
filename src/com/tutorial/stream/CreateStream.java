package com.tutorial.stream;

import java.util.Date;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 *  1- Stream<T>
 * 2- Stream <...>
 * 3- range ,rangeClose
 * 4 - intstream
 * 5- Stream.empty()
 * */
public class CreateStream {
    public static void main(String[] args) {
        //---------------------------//
        Stream.of(new Date()).map(Date::getTime).map(Object::toString).toArray();

        //---------------------------//
        Stream.Builder<String> builder = Stream.<String>builder().add("a").add("b").add("c");
        builder.accept("d");
        builder.build().forEach((string) -> {
            System.out.println(string);
        });


        for (int i = 0; i <= 10; i++) {
            System.out.println("---i : ---" + i);
        }

        IntStream.range(0,1).iterator().forEachRemaining(
                (Consumer<? super Integer>) value-> System.out.println(value));

        IntStream.rangeClosed(0,10).iterator().forEachRemaining(
                (Consumer<? super Integer>) value-> System.out.println(value));
    }
}
