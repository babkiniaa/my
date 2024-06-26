package org.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Dog dog() {
        Dog dog = new Dog();
        dog.setName("Жучка");
        return dog;
    }
    @Bean
    Cat cat() {
        Cat cat = new Cat();
        cat.setName("Маша");
        return cat;
    }
    @Bean
    Man man() {
        Man man = new Man();
        man.setName("Радон");
        man.setParrot(parrot());
        man.setParrot1(parrot1());
        man.setCat(cat());
        man.setDog(dog());
        return man;
    }
    @Bean
    Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Гоша");
        return parrot;
    }
    @Bean
    Parrot parrot1() {
        Parrot parrot = new Parrot();
        parrot.setName("Тоша");
        return parrot;
    }

}
