public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Ihor";
        person.age = 20;
        Person person1 = new Person();
        person1.name = "Vova";
        person1.age = 19;
        int year = person.calculateYearsToRetirement();
        int year1 = person1.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии : " + year);
        System.out.println("Второму человеку до пенсии : " + year1);
    }
}

class Person {
    // У класса могут быть:
    // 1. Данные (поля)
    // 2. Действия которые он может совершать (методы)
    String name;
    int age;
    // Тип возвращаемого значения метода. int == return
    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }
    }

    void sayHello() {
        System.out.println("Hello!");
    }
}
