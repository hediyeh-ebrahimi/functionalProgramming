package com.tutorial.stream;

import com.tutorial.stream.map_flatMap.Person;

import java.util.Arrays;
import java.util.List;

/*
* peak -> debuging
*
* */
public class PeakMethod {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("hediyeh"),
                new Person("sara"),
                new Person("shiva"),
                new Person("shabnam")
        );

        people.stream()
                .filter(person -> person.getName().startsWith("sh"))
                .peek(person -> System.out.println(person.getName()))
                .forEach(person -> System.out.println(person.getName()));


        List<String> strings = Arrays.asList("string1","string2");
        strings.stream().map(CharSequence::chars)
                .flatMap(intStream -> intStream.mapToObj(value -> (char) value))
        .forEach(System.out::print);
    }
}
