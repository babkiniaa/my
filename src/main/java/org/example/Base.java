package org.example;

import lombok.NonNull;

import java.lang.Exception;

@Inheritance(day = 1)
public class Base {
}

class Child extends Base {
    @RepeatableAnnotation(hour = 1, forever = 12, description = "hi")
    public void process(DataContainer dataContainer) {
        try {
            dataContainer.setDay(12);
            dataContainer.setTemp(22);
            dataContainer.setDescription("Холодно, сидим дома");
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}

class Child2 extends Base {
    @RepeatableAnnotation(hour = 2, forever = 13, description = "bye")
    public void process(@NonNull DataContainer dataContainer) {
        try {
            dataContainer.setDay(1);
            dataContainer.setTemp(2);
            dataContainer.setDescription("Холодно, иди гуляй");
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}

@Inheritance(day = 1)
class Child3 extends Base {
    @RepeatableAnnotation(hour = 12, forever = 1, description = "Who i")
    public void process(DataContainer dataContainer) {
        try {
            dataContainer.setDay(11);
            dataContainer.setTemp(21);
            dataContainer.setDescription("Я сам не знаю");
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}


