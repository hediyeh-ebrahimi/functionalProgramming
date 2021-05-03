package com.tutorial.supplier;

import com.tutorial.consumer.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "jdbc://localhost:1521:orcl";
        System.out.println(supplier.get());

        Supplier<List<Customer>> listSupplier = () ->
                Arrays.asList(
                        new Customer("hediyeh", "123")
                        , new Customer("sara", "456"),
                        new Customer("shabnam", "789"));

        listSupplier.get().stream().forEach(System.out::println);
    }
}
