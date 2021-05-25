package com.tutorial.generic;

import java.util.Date;

/*
* generic = type safe
* compile error
* generic data is in source not in runtime
*
* */
public class Wrapper<T , N extends  Number> {
    private T value;
    private N number;

    public Wrapper() {
    }

    public Wrapper(T value, N number) {
        this.value = value;
        this.number = number;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


    public N getNumber() {
        return number;
    }

    public void setNumber(N number) {
        this.number = number;
    }

    public <V extends Date> void getData(V input){
        System.out.println(input.getTime());
    }
}

