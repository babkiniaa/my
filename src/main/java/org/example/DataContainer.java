package org.example;

import lombok.Getter;
import lombok.Setter;

import java.lang.annotation.*;

@Getter
@Setter
public class DataContainer {

    private int day;

    private String description;

    private int temp;

}