package org.bean;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class MainTest {
    @Test
    void main() {
        String waitStr = "Гоша";
        String riderStr = "";
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean("parrot", Parrot.class);
        Man man = context.getBean(Man.class);
        System.out.println(man.toString());
        System.out.println(parrot.getName());
        riderStr = parrot.getName();
        Assert.assertEquals(riderStr, waitStr);
    }
}