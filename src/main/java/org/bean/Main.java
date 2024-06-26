package org.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.Context;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean("parrot",Parrot.class);
        Man man = context.getBean(Man.class);
        System.out.println(man.toString());
        System.out.println(parrot.getName());
    }
}