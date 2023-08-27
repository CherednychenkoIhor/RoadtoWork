package AbstractClasses;

public class Dog extends Animal implements AbleToMakeSound{
    @Override
    public void makeSound() {
        System.out.println("bark...");
    }
}
