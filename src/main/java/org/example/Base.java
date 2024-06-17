package org.example;

@Father
public class Base {
}
class Child extends Base{
}
@Mother
class AnotherChild extends Base{
}

@MyNewAnnotation(one = 0, two = "hi")
class Childs extends Base{
    public void process(DataContainer dataContainer){

    }
}
@MyNewAnnotation(one = 2, two = "bye")
class AnotherChilds extends Base{
    public void processGo(DataContainer dataContainer){

    }
}

