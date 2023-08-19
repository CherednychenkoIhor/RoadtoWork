public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "Hello ";
        strings[1] = "I LOVE";
        strings[2] = " U";

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]);
        }

        System.out.println();

        for (String string : strings) {     // foreach (тип данных переменная : массив с которым мы работаем)
            System.out.print(string);
        }

        System.out.println();

        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int number : numbers1) {
            sum += number;
        }
        System.out.println("Sum = " + sum);

        int value = 0; // Выделяется 32 бита
        String s = "Hi"; // Это лишь адрес, ссылка, лишь при иницыализации выделяется память под строку (Дом и адрес)
        System.out.println(s);
    }
}
