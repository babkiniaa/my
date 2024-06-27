package org.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.Context;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Man man = context.getBean(Man.class);
        man.getCat().setName("Патрик");
        man.getParrot().setName("Антон");
        System.out.println(man.getParrot1().getName());

    }
}