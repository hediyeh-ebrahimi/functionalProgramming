package com.tutorial.optional;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Optional<String> optionalS = Optional.of("test");
        System.out.println(optionalS.get());

        //NullPointerException
        //Optional<String> optional = Optional.of(null);
        //System.out.println(optional.get());

        Optional<String> optional1 = Optional.ofNullable("tese");
        System.out.println(optional1.get());

        Optional.ofNullable("test3"/*null*/)
                .ifPresent(System.out::println);


        Object defaultValue = Optional.ofNullable(null)
                .orElseGet(()-> "Default");
        System.out.println(defaultValue);

        String defaultValue0 = Optional.ofNullable("hediyeh")
                .orElseGet(()-> "Default");
        System.out.println(defaultValue0);


        //Exception
        Object excepObj = Optional.ofNullable(null).orElseThrow(()-> new IllegalStateException());
        System.out.println(excepObj);

    }
}
