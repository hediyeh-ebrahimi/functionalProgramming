package com.tutorial.consumer;

import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {
        BiConsumer<Customer, Boolean> biConsumer = (customer, aBoolean) ->
                System.out.println("Hello " + customer.getName()
                        +
                        ((aBoolean) ? " "+customer.getPhoneNumber() : "***")
                );

        biConsumer.accept(new Customer("nilol","777"),true);
        biConsumer.accept(new Customer("nikol","888"),false);
    }
}
