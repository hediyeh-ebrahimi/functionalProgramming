package com.tutorial.stream;

import java.util.*;
import java.util.stream.Collectors;

/*
 * groupBy
 * joining
 * Collectors.summingLong()
 * Collectors.toSet()
 * unmodifiableSet
 * */
public class GroupByStream {
    public static void main(String[] args) {
        List<AggregationMethods.Person> people = Arrays.asList(
                new AggregationMethods.Person("hediyeh", 7000L),
                new AggregationMethods.Person("sara", 10000L),
                new AggregationMethods.Person("shabnam", 150000L),
                new AggregationMethods.Person("shiva", 230000L),
                new AggregationMethods.Person("shiva", 250000L)
        );

        Map<String, List<AggregationMethods.Person>> mapList = people.stream()
                .collect(Collectors.groupingBy(AggregationMethods.Person::getName));
        System.out.println("--------Map----------" + mapList);

        Map<String, Long> stringLongMap = people.stream()
                .collect(Collectors.groupingBy(AggregationMethods.Person::getName, Collectors.counting()));
        System.out.println("-----------Map -> key,value-----------" + stringLongMap);

        Map<String, Long> sumMap = people.stream()
                .collect(Collectors.groupingBy(
                        AggregationMethods.Person::getName
                        , Collectors.summingLong(AggregationMethods.Person::getSalary)
                ));
        System.out.println("--------sum Map---------" + sumMap);

        Map<String,String> joiningRes = people.stream()
                .collect(Collectors.groupingBy(AggregationMethods.Person::getName
                ,Collectors.mapping(person -> String.valueOf(person.getSalary()),Collectors.joining(","))))
                ;
        System.out.println("---------joining Map---------"+joiningRes);

        Map<String, Set<AggregationMethods.Person>> personSet = people.stream()
                .collect(Collectors.groupingBy(AggregationMethods.Person::getName,Collectors.toSet()));
        System.out.println("-----------Map Set --------"+personSet);

        Map<String,Set<AggregationMethods.Person>> modificationSet = people.stream()
                .collect(Collectors.groupingBy(
                        AggregationMethods.Person::getName,
                        Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet)));
        System.out.println("-----------------modification Set-----------"+modificationSet);


    }
}
