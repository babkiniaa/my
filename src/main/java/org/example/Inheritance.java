package org.example;

import java.lang.annotation.*;

@Inherited
@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Inheritance {
    int day();
}

