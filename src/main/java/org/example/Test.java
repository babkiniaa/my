package org.example;

import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
//        Child child = new Child();
        Reflection ref = new Reflection();
        DataContainer dc = new DataContainer();
//        child.process(null);
//        child.process1(null);
        IOC ioc = new IOC();
        ioc.createLog();
        ref.refl(1, 1,dc);

    }
}
