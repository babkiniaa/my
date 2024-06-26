package org.component;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
public class Man {
    private String name;
    private Parrot parrot;
    private Parrot parrot1;
    private Cat cat;
    private Dog dog;
}
