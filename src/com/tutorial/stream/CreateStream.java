package com.tutorial.stream;

import java.util.Date;
import java.util.stream.Stream;
/*
*  1- Stream<T>
* 2- Stream <...>
*
* */
public class CreateStream {
    public static void main(String[] args) {
        Stream.of(new Date()).map(Date::getTime).map(Object::toString).toArray();

    }
}
