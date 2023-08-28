package NestedClasses;

// В Джаве есть три типа вложенных классов

public class Electrocar {
    private int id;

    // Первый тип это -- Вложенный Нестатический Класс. Они нужны тогда, когда объект этого класса сложный, комплексный
    // и когда его можно розделить на несколько под объектов.  Обрати внимание на метод start();
    // имеет доступ к нестатическим полям класса родителя
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting...");
        }
    }

    // Второй тип это -- Статический Вложенный Класс.
    // Логика в группировке классов Battery и Electrocar, возможность связать эти два класса
    // Не имеет доступа к не static полям родителя
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        int x = 1;

        // Третий тип это -- Вложенный Класс который находится в методе.
        // имеет доступ к нестатическим полям класса родителя и к переменным метода (only final)
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }
        SomeClass someClass = new SomeClass();
        test(someClass);
        System.out.println("Electrocar " + id + " is starting...");
    }
    private void test(Object object) {

    }
}
