package com.tutorial.lambda;

/*
 * Function<T,R>  => R apply(T t)
 * BiFunction<T,U,R> => R apply(T t,U u)
 * Predicate<T> => boolean test(T t)
 * BiPredicate<T,U> => boolean test(T t,U u)
 * Consumer<T> => void accept(T t)
 * BiConsumer<T,U> => void accept(T t,U u)
 * Supplier<T> => T get()
 * UnaryOperator<T> => T apply(T t)
 * BinaryOperator<T> => T apply(T t1,T t2)
 */


import java.util.function.IntFunction;
import java.util.function.ToDoubleFunction;

/*
 * IntFunction<R> => R function(int)
 * LongFunction<R> => R function(long)
 * DoubleFunction<R> => R function(double)
 * ToIntFunction<T> => int function(T t)
 * ToLongFunction<T> => long function(T t)
 * ToDoubleFunction<T> => double function(T t)
 * */
public class GenericsLambda {
    public static void main(String[] args) {
        Appender<String> appender = (x, y) -> x + y;
        String append = appender.append("Hello ", "Generics");
        System.out.println(append);

        Appender<Integer> appenderSum = Integer::sum;
        Integer appendInteger = appenderSum.append(1, 3);
        System.out.println(appendInteger);


        IntFunction<Long> intFunction = Long::valueOf;//value->Long.valueof(value);
        System.out.println(intFunction.apply(5));

        ToDoubleFunction<Double> doubleToDoubleFunction = value -> value * 2.5d;
        System.out.println(doubleToDoubleFunction.applyAsDouble(5d));


    }

    @FunctionalInterface
    public interface Appender<T> {
        T append(T s1, T s2);
    }

}
