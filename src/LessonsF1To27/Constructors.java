package LessonsF1To27;

public class Constructors {
    public static void main(String[] args) {
        Human1 human1 = new Human1("Bob", 45);
        Human1 human2 = new Human1("Tomas", 27);
        Human1 human3 = new Human1("Rob", 55);
        Human1.printNumberOfPeople();
    }
}

class Human1 {
    private String name;
    private int age;
    private static int countPeople = 0;

    public Human1(String name, int age) {
//        System.out.println("Привет из третьего конструктора!");
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void printNumberOfPeople() {
        System.out.println("Number of people: " + countPeople);
    }
}

//    public Lessons1To28.Human1() {
//        this("Bob",12);
//    }
//
//    public Lessons1To28.Human1(String name) {
//        System.out.println("Привет из второго конструктора!");
//        this.name = name;
//    }
