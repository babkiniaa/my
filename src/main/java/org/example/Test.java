package org.example;

import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Reflection ref = new Reflection();
        DataContainer dc = new DataContainer();
        IOC ioc = new IOC();
        ioc.createLog();
        ref.refl(1, 1,dc);

    }
}
