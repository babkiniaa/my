package org.example;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.InvocationTargetException;

public class test {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
//        Child child = new Child();
        Reflection ref = new Reflection();
        DataContainer dc = new DataContainer();
//        child.process(null);
//        child.process1(null);
        ref.refl(1, 1,dc);
//        IOC ioc = new IOC();
//        ioc.createLog();

    }
}
