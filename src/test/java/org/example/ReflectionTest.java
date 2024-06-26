package org.example;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class ReflectionTest {
    @Test
    public void refl() throws InvocationTargetException, IllegalAccessException, InstantiationException {
        String rider = "";
        String wait = "DataContainer(day=1, description=Холодно, иди гуляй, temp=2)\n" +
                "DataContainer(day=1, description=Холодно, иди гуляй, temp=2)";
        Reflection reflection = new Reflection();
        List<Class> children = new ArrayList<>();
        DataContainer dataContainer = new DataContainer();
        reflection.init(children);
        children = reflection.searchneed(children, 1);
        rider = reflection.inv(children, 1, rider, dataContainer);
        assertEquals(rider,wait);
    }

}