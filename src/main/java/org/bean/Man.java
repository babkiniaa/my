package org.bean;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class Man {
    private String name;
    private Parrot parrot;
    private Parrot parrot1;
    private Cat cat;
    private Dog dog;
}
