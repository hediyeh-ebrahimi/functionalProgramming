package com.tutorial.optional;


import com.tutorial.stream.map_flatMap.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 * get =>exception
 * isPersent
 * orElse
 * orElseGet
 * orElseThrow
 * ofNullable => empty
 * ifPresentOrElse => runnable
 * */
public class OptionalMethods {
    public static void main(String[] args) throws IllegalAccessException {

        List<Person> people = Arrays.asList(
                new Person("hediyeh"),
                new Person("sara"),
                new Person("shiva"),
                new Person("shabnam")
        );

        Person person = people.stream()
                .filter(person1 -> person1.getName().equals("test"))
                .findFirst()
                //.get()
                // .orElse(new Person())
                .orElseThrow(IllegalAccessException::new);
        System.out.println("------------Name-------------" + person.getName());



    }
}
