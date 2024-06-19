package org.example;

import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

import java.lang.Exception;

@Inheritance(day = 1)
abstract class Base {
    abstract void process(DataContainer dataContainer);

    abstract void process1(DataContainer dataContainer);
}

@Inheritance(day = 1)
class Child extends Base {
    @Override
    @RepeatableAnnotation(hour = 1, forever = 1, description = "hi")
    void process(@NotNull DataContainer dataContainer) {
        dataContainer.setDay(12);
        dataContainer.setTemp(22);
        dataContainer.setDescription("Холодно, сидим дома");
    }

    @Override
    @RepeatableAnnotation(hour = 2, forever = 2, description = "hi1")
    void process1(@NotNull DataContainer dataContainer) {
            dataContainer.setDay(12);
            dataContainer.setTemp(22);
            dataContainer.setDescription("Тепло, сидим дома");
    }
}

@Inheritance(day = 1)
class Child2 extends Base {
    @Override
    @RepeatableAnnotation(hour = 2, forever = 1, description = "bye")
    void process(@NotNull DataContainer dataContainer) {
        dataContainer.setDay(1);
        dataContainer.setTemp(2);
        dataContainer.setDescription("Холодно, иди гуляй");
    }

    @Override
    @RepeatableAnnotation(hour = 3, forever = 2, description = "bye2")
    void process1(@NotNull DataContainer dataContainer) {
        dataContainer.setDay(12);
        dataContainer.setTemp(22);
        dataContainer.setDescription("Холодно, лучше посижу дома");
    }
}

@Inheritance(day = 2)
class Child3 extends Base {
    @Override
    @RepeatableAnnotation(hour = 12, forever = 1, description = "Who i")
    public void process(@NotNull DataContainer dataContainer) {
        dataContainer.setDay(11);
        dataContainer.setTemp(21);
        dataContainer.setDescription("Я сам не знаю");
    }

    @Override
    @RepeatableAnnotation(hour = 3, forever = 2, description = "Who i1")
    void process1(@NotNull DataContainer dataContainer) {
        dataContainer.setDay(11);
        dataContainer.setTemp(21);
        dataContainer.setDescription("Посмотри сам");
    }
}

