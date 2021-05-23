package com.tutorial.lambda;

import java.io.*;

public class IntersectionType {
    public static void main(String[] args) throws FileNotFoundException {
        read(new DataInputStream(new FileInputStream("")));

        Serializable appender = (Appender<String> & Serializable)(s1,s2)-> s1+" "+s2;
        Appender1<String> appender1 = (Appender1<String>)(s1,s2) ->s2+" "+s1;
    }

    public static <I extends DataInput & Closeable> void read(I source){
        try{

        }catch(Exception E){

        }finally{
            //close
        }

    }

    @FunctionalInterface
    public interface Appender<T> {
        T append(T s1, T s2);
    }

    @FunctionalInterface
    public interface Appender1<T> {
        T append(T s1, T s2);
    }
}
