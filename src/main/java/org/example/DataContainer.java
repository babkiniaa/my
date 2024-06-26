package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.lang.annotation.*;

@Data
public class DataContainer {

    public int day;

    public String description;

    public int temp;


}