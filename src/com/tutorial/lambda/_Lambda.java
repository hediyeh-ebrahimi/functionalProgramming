package com.tutorial.lambda;

/*
 * java 8 => default method
 * @Functional Interface Annotation
 * static method
 * */
public class _Lambda {
    public static void main(String[] args) {
        _Lambda lambda = new _Lambda();
        //lambda.method((str1, str2) -> str1.concat(str2)); /*=> Ambigus method call*/

        //First Way
        System.out.println(lambda.method((String s1, String s2) -> s1.concat(s2)));
        System.out.println(lambda.method((int s1, int s2) -> s1 + s2));

        //Second Way
        lambda.method((Concatable) ((s1, s2) -> s1 + s2));

        //Third Way
        Aggregation aggregation = (s1, s2) -> s1 + s2;
        lambda.method(aggregation);

        //Default Method
        System.out.println(aggregation.multiple(5, 2));

        AggregationClass aggregationClass = new AggregationClass();
        System.out.println(aggregationClass.multiple(5, 6));

        System.out.println(Aggregation.minus(5, 3));

    }

    static class AggregationClass implements Aggregation {

        @Override
        public int sum(int s1, int s2) {
            return 0;
        }

    }

    String method(Concatable concatable) {
        return concatable.concat("Hi ", "Lambda");

    }

    int method(Aggregation aggregation) {
        return aggregation.sum(5, 2);
    }

    interface Concatable {
        String concat(String a, String b);
    }

    @FunctionalInterface
    interface Aggregation {
        int sum(int s1, int s2);

        default int multiple(int s1, int s2) {
            return s1 * s2;
        }

        static int minus(int s1, int s2) {
            return s1 - s2;
        }
        // => it s override it is okay
        boolean equals(Object o);
    }


}
