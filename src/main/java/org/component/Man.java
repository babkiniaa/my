package org.component;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Man {
    private String name;
    @Autowired
    private Parrot parrot;
    @Autowired
    private Parrot parrot1;
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
}
