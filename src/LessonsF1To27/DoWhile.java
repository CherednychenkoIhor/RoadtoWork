package LessonsF1To27;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Please enter 5");
            value = scanner.nextInt();
        } while (value != 5);
        System.out.println("You enter a five");
    }
}
