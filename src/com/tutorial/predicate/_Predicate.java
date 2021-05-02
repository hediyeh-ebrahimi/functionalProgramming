package com.tutorial.predicate;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        //Imperative
        System.out.println(verificationEmail("test"));

        //Declarative
        Predicate<String> predicateEmail = (email) -> email.contains("@");
//        System.out.println(predicateEmail.test("hediyeh@"));

        Predicate<String> predicateExten = str ->  str.contains(".com");
        System.out.println("----*****-----"+predicateEmail.and(predicateExten).test("hediyeh@gmail.com"));



    }

    private static boolean verificationEmail(String email){
        return (email.contains("@")) ? true: false ;
    }
}
