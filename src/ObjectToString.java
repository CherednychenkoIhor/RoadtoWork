public class ObjectToString {
    public static void main(String[] args) {
        Human2 human1 = new Human2("Bob", 45);
        System.out.println(human1);
    }
}

class Human2 {
    private String name;
    private int age;

    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
