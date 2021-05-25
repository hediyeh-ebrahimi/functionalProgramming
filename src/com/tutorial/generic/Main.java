package com.tutorial.generic;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Wrapper<String,Long> wrapper = new Wrapper<String,Long>("Generics Test",10L);
        String value = wrapper.getValue();
        System.out.println(value);

        wrapper.getData(new Date());

//        Wrapper<?,?> wrapper1 = new Wrapper<String>("jj");
    }
}
