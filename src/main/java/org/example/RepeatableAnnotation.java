package org.example;

import java.lang.annotation.*;
@Repeatable(RepeatableAnnotation2.class)
@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatableAnnotation {
    int hour();
    int forever();
    String description();
}

@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface RepeatableAnnotation2 {
   RepeatableAnnotation[] value();
}

