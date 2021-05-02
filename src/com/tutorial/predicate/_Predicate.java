package com.tutorial.predicate;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        //Imperative
        System.out.println(verificationEmail("test"));

        //Declarative
        Predicate<String> predicate = (email) -> email.contains("@");
        System.out.println(predicate.test("hediyeh@"));
    }

    private static boolean verificationEmail(String email){
        return (email.contains("@")) ? true: false ;
    }
}
