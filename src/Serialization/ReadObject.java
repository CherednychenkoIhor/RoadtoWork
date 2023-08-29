package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {
            Person person1 = (Person) ois.readObject();
            System.out.println(person1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
