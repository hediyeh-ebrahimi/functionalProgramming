package com.tutorial.annotation;

import com.tutorial.stream.AggregationMethods;
import com.tutorial.stream.AggregationMethods.Person;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
 * document
 * runTime property
 * inheritance not exist
 * use annotation by java reflection
 * methods not have inputs
 * arrays are single dimension
 * */

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface Annotation {

    double d() default 12;

    int[] x() default {1, 2};

    String s() default "Hello";

    String[] s2() default {"a", "b"};

    Class c() default Exception.class;

    Class[] c2() default {Exception.class, java.io.IOException.class};

    Class<Person> person() default Person.class;
}

@interface Enabled {
    boolean enable() default true;
}
