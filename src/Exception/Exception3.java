package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        // Checked Exception (Compile time exception) во время компиляции -- исключительные случаи в работе программы

        // Examples of Compile time exception
//        File file = new File("test");
//        Scanner scanner = new Scanner(file);

        // Unchecked Exception (Runtime exception) во время выполнения программы -- ошибка в работе программы
        // самый простой пример диление на 0 (1 / 0)

        // Examples of Runtime exception
//        int x = 1 / 0;
//        String name = null;
//        name.length();
        try {
            int[] arr = new int[2];
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Пользователь вышел за массив");
        }
    }
}
