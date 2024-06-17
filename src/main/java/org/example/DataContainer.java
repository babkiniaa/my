package org.example;

import lombok.Getter;
import lombok.Setter;

import java.lang.annotation.*;

@Getter
@Setter
public class DataContainer {

    public int day;

    public String description;

    public int temp;

}