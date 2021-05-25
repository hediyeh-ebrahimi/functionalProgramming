package com.tutorial.exception;

import com.tutorial.exception.exceptions.RuleException;

public class ApiInterfaceImpl implements ApiInterface {
    @Override
    public void getData() throws RuleException {
        System.out.println("ApiInterfaceImpl");
    }
}
