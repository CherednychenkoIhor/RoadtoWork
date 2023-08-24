package LessonsF1To27;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше Имя: ");
        String name = scan.nextLine();
        System.out.print("Введите вашу Фамилию: ");
        String surName = scan.nextLine();
        System.out.print("Ваш возрост: ");
        int age = scan.nextInt();
        System.out.println("Ваши данные: " + name + " " + surName + " " + age + " year");
//        System.out.println("Вы ввели: " + s);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Устроится ли Котик на работу?");
//        boolean findWork = scanner.nextBoolean();
//        if (findWork == true) {
//            System.out.println("We would live together my Kitty ❤️❤️❤️");
//        } else {
//            System.out.println("He is trying to find work");
//        }
    }
}
