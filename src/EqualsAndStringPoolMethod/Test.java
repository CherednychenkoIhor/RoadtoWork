package EqualsAndStringPoolMethod;

public class Test {
    public static void main(String[] args) {
//        int x = 1;
//        int y = 1;
//        System.out.println(x == y);
//        == работает для примитивных типов данных

        //   animal1        ->       {1}
        //   animal2        ->       {1}

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        System.out.println(animal1.equals(animal2));
//        Animal animal1 = new Animal(1);
//        Animal animal2 = animal1;
//
//        System.out.println(animal1 == animal2); = true

//        equals() -- нужно использовать всегда, когда нужно сравнить объекты по их структуре

         // Сравнение строк
        String string1 = "Hello";       //      string1         ->              {"Hello"}
        String string2 = "Hello";       //      string2         ->
        System.out.println(string1.equals(string2));  // true
        // String Pool --- это пул всех строк в Java. Когда первый раз создаешь строку "Hello", она помещается в Pool
        // по этому при создании похожего объекта, она ссылается на уже существующий объект. string1 -> "Hello"
        // string2 -> "Hello" указывает на один и тот же объект.
        // Благодоря этому Java экономит память, ресурсы и время на создание нового объекта String.
        // если мы по другому создадим,
//        String string1 = new String("Hello");
//        String string2 = new String("Hello");
//        System.out.println(string1 == string2); // false
        String a = "hello";
        String b = "helloJ23".substring(0, 5); // 0 = h, 5 = J последняя буква (Не включительно)

        System.out.println(a == b); // false;      a.equals(b) = true

    }
}

class Animal {
    private int id;

    public Animal (int id) {
        this.id = id;
    }

    public boolean equals(Object object) {
        Animal otherAnimal = (Animal) object;
        return this.id == otherAnimal.id;
    }
}
