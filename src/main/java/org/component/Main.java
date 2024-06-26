package org.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.Context;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean(Parrot.class);
        Dog dog = context.getBean(Dog.class);
        parrot.setName("Bася");
        System.out.println(parrot.getName());
    }
}