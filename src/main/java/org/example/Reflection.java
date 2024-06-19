package org.example;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reflection {
    public List<Class> init(List<Class> child) {
        child.add(Child.class);
        child.add(Child2.class);
        child.add(Child3.class);
        return child;
    }

    public List<Class> searchneed(List<Class> child, int day) {
        child = child.stream().filter(x -> ((Inheritance)x.getAnnotation(Inheritance.class)).day() == day).collect(Collectors.toList());
        System.out.println(child);
        return child;

    }
    public void inv(List<Class> child, int hour, DataContainer dc) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        for(Class sub : child){
            Object s = sub.newInstance();
            List<Method> ms = List.of(sub.getDeclaredMethods());
            ms = ms.stream().filter(x -> ((RepeatableAnnotation)x.getAnnotation(RepeatableAnnotation.class)).hour()==hour).collect(Collectors.toList());
            ms = ms.stream().sorted(Comparator.comparingInt(x -> ((RepeatableAnnotation)x.getAnnotation(RepeatableAnnotation.class)).forever())).toList();
            for(Method m: ms){
                m.invoke(s, dc);
                System.out.println(dc.toString());            }
        }
    }

    public void refl(int day, int hour, DataContainer dataContainer) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        List<Class> children = new ArrayList<>();
        init(children);
        children = searchneed(children, day);
        inv(children, hour, dataContainer);
    }
}
