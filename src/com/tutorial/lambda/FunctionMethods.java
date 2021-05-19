package com.tutorial.lambda;

import java.time.LocalDate;
import java.util.Date;
import java.util.function.Function;

/*
 * identity => input = output
 * andThen => string->integer -> integer -> long => string -> long
 * compose =>  string -> integer -> date->string  => date -> integer
 * */
public class FunctionMethods {
    public static void main(String[] args) {

        //identity
        Function<String, String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("Test Identity Of Function"));

        //andThen
        Function<String, Integer> stringIntegerFunction = String::length;
        Function<Integer, Long> integerLongFunction = value -> value + 1L;
        Function<String, Long> stringLongFunction = stringIntegerFunction.andThen(integerLongFunction);
        System.out.println(stringLongFunction.apply("Hi AndThen"));//length=10 +1

        //compose
        Function<Date,String> dateStringFunction = Date::toString;
        Function<String,Integer> stringIntegerFunction1 = String::length;
        Function<Date, Integer> compose = stringIntegerFunction1.compose(dateStringFunction);
        System.out.println(compose.apply(new Date()));


    }
}
