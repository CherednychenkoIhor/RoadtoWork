public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person();
        person.setNameAndAge("Ihor", 20);

        String s = "Vova";
        Person person1 = new Person();
        person1.setNameAndAge(s, 19);

        person.speak();
        person1.speak();
    }
}

class Person {
    // У класса могут быть:
    // 1. Данные (поля)
    String name;
    int age;

    // 2. Действия которые он может совершать (методы)
    // Тип возвращаемого значения метода. int == return
    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

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
