package com.tutorial.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Repeatable(Queries.class)
public @interface Query {
    String name();
    String value();
}
