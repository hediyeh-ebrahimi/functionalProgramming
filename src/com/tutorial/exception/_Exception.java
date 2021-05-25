package com.tutorial.exception;

import com.tutorial.exception.exceptions.RuleException;

/*
*  checked Exception => extend of exception ==== handel exception
* unchecked Exception => extend of runTimeException
* exception -> contingent or fault
*
* */
public class _Exception {

    public static void main(String[] args) {
        ApiInterface apiInterface = new ApiInterfaceImpl();
        try {
            apiInterface.getData();
        } catch (RuleException e) {
            e.printStackTrace();
        }

    }

}
