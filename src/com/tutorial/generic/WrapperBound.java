package com.tutorial.generic;

public class WrapperBound<T> {
    private T value;

    public WrapperBound() {
    }

    public WrapperBound(T value) {
        this.value = value;
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
