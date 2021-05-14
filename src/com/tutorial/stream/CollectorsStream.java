package com.tutorial.stream;

import java.util.*;
import java.util.stream.Collectors;

/*
* collect
* toMap
* toList
* treeMap
* joining
*
* */
public class CollectorsStream {
    public static void main(String[] args) {

        List<AggregationMethods.Person> people = Arrays.asList(
                new AggregationMethods.Person("hediyeh", 7000L),
                new AggregationMethods.Person("sara", 10000L),
                new AggregationMethods.Person("shabnam", 150000L),
                new AggregationMethods.Person("shiva", 230000L)
        );

        people.stream().collect(Collectors.toList()); //new ArrayList<>(people);
        people.stream().collect(Collectors.toSet()); // new HashSet<>(people);
        people.stream().collect(Collectors.toCollection(HashSet::new)); //new HashSet<>(people);
        people.stream().collect(Collectors.counting());//people.stream().count();


        Map<String, Long> peopleMap = people.stream()
                .collect(Collectors.toMap(AggregationMethods.Person::getName, AggregationMethods.Person::getSalary));
        System.out.println("-------Map-------" + peopleMap);

        //repetitive key => merge function
        List<AggregationMethods.Person> peopleDuplicate = Arrays.asList(
                new AggregationMethods.Person("hediyeh", 7000L),
                new AggregationMethods.Person("sara", 10000L),
                new AggregationMethods.Person("sara", 15000L),
                new AggregationMethods.Person("shabnam", 150000L),
                new AggregationMethods.Person("shiva", 230000L),
                new AggregationMethods.Person("shiva", 250000L)
        );
        Map<String, Long> dupKeyMap = peopleDuplicate.stream()
                .collect(Collectors.toMap(AggregationMethods.Person::getName, AggregationMethods.Person::getSalary,
                        (value1, value2) -> value1 > value2 ? value1 : value2));
        System.out.println("------Duplicate Key--------"+dupKeyMap);

        Map<String, Long> treeMap = peopleDuplicate.stream()
                .collect(Collectors.toMap(AggregationMethods.Person::getName, AggregationMethods.Person::getSalary,
                        (value1, value2) -> value1 > value2 ? value1 : value2, TreeMap::new));
        System.out.println("------Tree Map--------"+treeMap);

        String joining = people.stream()
                .map(AggregationMethods.Person::getName)
                .collect(Collectors.joining());
        System.out.println("----Joining------"+joining);

        String joiningByDelimiter = people.stream()
                .map(AggregationMethods.Person::getName)
                .collect(Collectors.joining(",","<start>","<end>"));
        System.out.println("-------Joining By details--------"+joiningByDelimiter);


    }
}
