package org.component;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        String waitStr = "Антон";
        String riderStr = "";
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Man man = context.getBean(Man.class);
        man.getCat().setName("Патрик");
        man.getParrot().setName("Антон");
        riderStr = man.getParrot().getName();
        System.out.println(man.getParrot().getName());
        Assert.assertEquals(riderStr, waitStr);
    }
}