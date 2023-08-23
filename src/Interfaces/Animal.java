package Interfaces;

public class Animal implements Info { // Class может релизовывать любое количество интерфейсов (implements Info, ...) но наследовать лишь один
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }

    public void showInfo() {
        System.out.println("Id is " + this.id);
    }
}
