package org.example;

import org.example.DataContainer;
import org.example.Reflection;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ReflectionTest {
    @Test
    public void refl() throws InvocationTargetException, IllegalAccessException, InstantiationException {
        String riderStr = "";
        String wait = "DataContainer(day=12, temp=22, description=Холодно, сидим дома)\n" +
                "DataContainer(day=12, temp=22, description=Тепло, сидим дома)\n";
        Reflection reflection = new Reflection();
        List<Class> children = new ArrayList<>();
        DataContainer dataContainer = new DataContainer();
        reflection.init(children);
        children = reflection.searchneed(children, 1);
        riderStr = reflection.inv(children, 1, riderStr, dataContainer);
        Assert.assertEquals(riderStr, wait);
    }
}