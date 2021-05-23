package com.tutorial.lambda;

import org.omg.SendingContext.RunTime;

public class AnonymousClass {
    public static void main(String[] args) {
        // without byteAcode
        Runnable runtime = () -> System.out.println(" Runtime method");


        // new bytecode during running
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println(" Runnable anonymous classs");
            }
        };
    }
}
