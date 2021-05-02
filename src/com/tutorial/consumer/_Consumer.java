package com.tutorial.consumer;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        //Imperative
        greet(new Customer("hediyeh","093564"));

        //Declarative
        Consumer<Customer> customerConsumer = customer ->  System.out.println("Hello "+customer.getName()
                +" your phone number is "+customer.getPhoneNumber());
        customerConsumer.accept(new Customer("ali","456"));
    }


    public static void greet(Customer customer){
        System.out.println("Hello "+customer.getName()
        +" your phone number is "+customer.getPhoneNumber());
    }
}
