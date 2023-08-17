import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        String age = scanner.nextLine();
        switch (age) {
            case "zero" -> System.out.println("You born");
            case "seven" -> System.out.println("You went to school");
            case "eighteen" -> System.out.println("You finish school");
            default -> System.out.println("Ни одно из предедущих условий не подошло");
        }
    }
}
