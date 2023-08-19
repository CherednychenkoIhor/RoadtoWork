public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Ihor";
        person.age = 20;
        person.sayHello();
        person.speak();
        Person person1 = new Person();
        person1.name = "Vova";
        person1.age = 19;
        person1.sayHello();
        person1.speak();

    }
}

class Person {
    // У класса могут быть:
    // 1. Данные (поля)
    // 2. Действия которые он может совершать (методы)
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }
    }

    void sayHello() {
        System.out.println("Hello!");
    }
}
