public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Ihor";
        person.age = 20;
        System.out.println("Меня зовут " + person.name + ", мне " + person.age + " лет" );

        Person person1 = new Person();
        person1.name = "Vova";
        person1.age = 19;
        System.out.println("Меня зовут " + person1.name + ", мне " + person1.age + " лет" );

    }
}

class Person {
    // У класса могут быть:
    // 1. Данные (поля)
    // 2. Действия которые он может совершать (методы)
    String name;
    int age;
}
