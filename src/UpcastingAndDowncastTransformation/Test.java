package UpcastingAndDowncastTransformation;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog dog = (Dog) a;
        dog.bark();  /* Exception in thread "main" java.lang.ClassCastException:
        Class UpcastingAndDowncastTransformation.Animal cannot be cast to class
        UpcastingAndDowncastTransformation.Dog (UpcastingAndDowncastTransformation.Animal
        and UpcastingAndDowncastTransformation.Dog are in unnamed module of loader 'app')
        at UpcastingAndDowncastTransformation.Test.main(Test.java:6) */
//        Dog dog = new Dog();
//        // Upcasting - Восходящее преобразование происходит неявно
//        Animal animal = dog; // == Animal animal = new Dog();
//
//        // Downcast - Нисходящее преобразование
//        Dog dog1 = (Dog) animal;
//        dog1.bark();
    }
}
