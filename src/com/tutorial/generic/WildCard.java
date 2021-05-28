package com.tutorial.generic;

import java.util.ArrayList;
import java.util.List;

/*
 * extends upper bounds => <? extends T>
 * super lower bounds => <? super T>
 * <? super T> // super type ==== writeable
 * <? extends T>  ==== readonly
 * exception ot have in generics
 *
 * */
public class WildCard {
    public static void main(String[] args) {

        List<Number> numbers = new ArrayList<>();
        numbers.add(123);
        numbers.add(13d);

        List<? super Integer> integers = numbers; // list is generated pararents of integer
        integers.add(12);
        Integer integer = (Integer) integers.get(0);


        List<Integer> integerList = new ArrayList<>();
        integerList.add(124);
        integerList.add(126);

        List<? extends Number> numbers1 = integerList; // list is generated from children of number
        Number number = numbers1.get(2);
        //numbers1.add(5);//fault//

        //Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        WrapperBound wrapperBound = new WrapperBound<Integer>(101);
        WrapperBound<String> stringWrapperBound = wrapperBound;
        String value = stringWrapperBound.getValue();
        System.out.println(value);

    }

    //out super
    //get extend
    public static double sum(WrapperBound<? extends Number> n1, WrapperBound<? extends Number> n2) {
        Number num1 = n1.getValue();
        Number num2 = n2.getValue();
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void copy(WrapperBound<? extends Number> source, WrapperBound<? super Number> dest) {
        Number num1 = source.getValue();
        dest.setValue(num1);

    }
}
