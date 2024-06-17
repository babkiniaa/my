package org.example;

import java.lang.annotation.*;

@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatableAnnotation {
    int hour();
    int forever();
    String description();
}

