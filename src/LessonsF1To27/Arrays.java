package LessonsF1To27;

public class Arrays {
    public static void main(String[] args) {
//        char character = 'a';             // Примитивный тип данных
//        String s = "Hello";               // Ссылочный тип данных String s1 = new String("Hello");
//        int number = 10; // Примитивный тип данных                  [10]
        int[] numbers = new int[5]; // Ссылочный тип данных         numbers -> [массив]
//        System.out.println(numbers[0]); // 0 1 2 3 4 [5]

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }

        int[] numbers1 = {1,3,45,6,8,4,2};
        for (int j : numbers1) {
            System.out.println(j);
        }
    }
}
