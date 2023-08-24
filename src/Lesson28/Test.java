package Lesson28;

import Lesson28.Package1.Person;

public class Test extends Person{
    protected int id;

    public Test() {
        name = "Tom";
    }

    public static void main(String[] args) {
        // public, private, default (Всё что default, доступно в пределах пакета) protected (доступно в пределах
        // одного пакета, доступны всем подклассам, даже если эти подклассы вне пакета, где эти поля или методы были
        // декларированы)
        Person person = new Person();
//        System.out.println(person.name);
    }
}
