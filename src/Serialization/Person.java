package Serialization;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable{

    @Serial
    private static final long serialVersionUID = 3839607345071955850L;
//    private static final long serialVersionUID = -8866102124089028714L; // Сейв от редактирования и чтения
    private int id;
    private String personName;
    private int age;
    private byte type;

    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return personName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + personName + '\'' +
                '}';
    }
}
