package AbstractClassAndMethod;

public class AnotherExampleClass extends ExampleClass {
    @Override
    public void exampleMethod() {
        System.out.println("Overide method from abstract class");
    }

    @Override
    public void exampleAbstractMethod() {
        System.out.println("This is a abstract method");
    }
}
