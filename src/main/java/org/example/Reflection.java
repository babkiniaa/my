package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Reflection {

    public List<Class> init(List<Class> childrensClass) {
        childrensClass.add(Child.class);
        childrensClass.add(Child2.class);
        childrensClass.add(Child3.class);
        return childrensClass;
    }

    public List<Class> searchneed(List<Class> childrensClass, int day) {
        childrensClass = childrensClass.stream().filter(x -> ((Inheritance) x.getAnnotation(Inheritance.class)).day() == day).collect(Collectors.toList());
        return childrensClass;

    }

    public String inv(List<Class> child, int hour, String riderStr, DataContainer dC) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        for (Class sub : child) {
            Object newInstance = sub.newInstance();
            List<Method> ms = List.of(sub.getDeclaredMethods());
            ms = ms.stream().filter(x -> ((RepeatableAnnotation) x.getAnnotation(RepeatableAnnotation.class)).hour() == hour).collect(Collectors.toList());
            ms = ms.stream().sorted(Comparator.comparingInt(x -> ((RepeatableAnnotation) x.getAnnotation(RepeatableAnnotation.class)).forever())).toList();
            for (Method m : ms) {
                m.invoke(newInstance, dC);
                System.out.println(dC.toString());
                riderStr = riderStr + dC.toString() + '\n';
            }
        }
        return riderStr;
    }

    public void refl(int day, int hour, DataContainer dataContainer) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        IOC ioc = new IOC();
        String riderStr = "";
        List<Class> children = new ArrayList<>();
        init(children);
        children = searchneed(children, day);
        System.out.println(inv(children, hour, riderStr, dataContainer));
        ioc.writeFile(riderStr);
    }
}
