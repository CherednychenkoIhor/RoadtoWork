package Enum;

public class Test {
    public static void main(String[] args) {
//        Season season = Season.AUTUMN;
//        Animal animal = Animal.CAT;
//        System.out.println(animal.name()); // возвращает название enum в виде строки

//        Animal frog = Animal.valueOf("FROG"); // из строки получить enum
//        System.out.println(frog.getTranslation());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal()); // возвращает порядок в котором enum объявлен

//        Animal animal = Animal.DOG;
//        System.out.println(animal);

//        switch (animal) {
//            case CAT -> System.out.println("It's a cat!");
//            case DOG -> System.out.println("It`s a dog!");
//        }

//        Season season = Season.WINTER;
//        System.out.println(season.getTemperature());

        // Object -> Enum -> Season
        // instanceof -- проверка на наследие
//        System.out.println(season instanceof Season); true
//        System.out.println(season instanceof Enum); true
//        System.out.println(season instanceof Object); true
        // getClass() -- Метод определен в классе Object. Даёт тот класс объектом которого объект является
//        System.out.println(season.getClass());

//        switch (season) {
//            case SUMMER -> System.out.println("It`s warm outside");
//            case WINTER -> System.out.println("It`s cold outside");
//
//        }
    }
}
