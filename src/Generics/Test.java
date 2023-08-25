package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ///////////////////// Java 5 //////////////////////////
        Animal ourAnimal = new Animal();
        List animals = new ArrayList();
        animals.add("cat");  // 0
        animals.add("dog");  // 1
        animals.add("frog"); // 2
        animals.add(ourAnimal); // 3

//        String animal = (String) animals.get(3); // Error
//        System.out.println(animal);

        ///////////////////// С появлением Generics ////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        String animal2 = animals2.get(1);
        System.out.println(animal2);

        ///////////////////// Java 7 //////////////////////////
        List<String> animals3 = new ArrayList<>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        String animal3 = animals3.get(1);
        System.out.println(animal2);
    }
}
class Animal {

}

