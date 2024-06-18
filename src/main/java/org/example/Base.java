package org.example;

@Inheritance(day = 1)
public class Base {
}

class Child extends Base{
    @RepeatableAnnotation(hour = 1, forever = 12, description = "hi")
    public void process(DataContainer dataContainer){

    }
}

class Child2 extends Base{
    @RepeatableAnnotation(hour = 2, forever = 13, description = "bye")
    public void process(DataContainer dataContainer){

    }
}

@Inheritance(day = 1)
class Child3 extends Base{
    @RepeatableAnnotation(hour = 12, forever = 1, description = "Who i")
    public void process(DataContainer dataContainer){

    }
}


