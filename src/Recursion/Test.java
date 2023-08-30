package Recursion;

public class Test {
    public static void main(String[] args) {
        // Рекурсия это вызов метода в теле этого же метода
//        counter(3);
        System.out.println(fac(4));

        // 4! = 4 * 3 * 2 * 1
        // 1! = 1
        // 15! = 15 * 14 ... * 1
        // 0! = 1
    }

    // fac(4)
    // 4 * fac(3) = 24
    // 3 * fac(2) = 6
    // 2 * fac(1) = 2
    // fac(1) = return 1;

    public static int fac(int n) {
        if (n == 1)
            return 1;
        return n * fac(n - 1);
    }

//    // counter(3) -> counter(2) -> counter(1) -> counter(0)
//
//    //   Stack
//    // counter(3)
//    // counter(2)
//    // counter(1)
//    // counter(0)
//
//    public static void counter(int n) {
//        if (n == 0)
//            return;
//
//        System.out.println(n);
//
//        counter(n - 1);  // wait (3), (2), (1)
//
//    }
}
