package PrimitiveDataTypes;

public class Test {
    public static void main(String[] args) {
        // Primitive data types
        // int x = 23; 32-bit
        // short x = 123; 16-bit
        // byte x = 123; -128 to 127
        // long y = 1234; 64-bit
        // double a = 12.3; 64-bit
        // float q = 12.2f; 32-bit
        float f = 123.2f; // == float f = (float) 123.2;
        int a = 123;
        long l = a; // Неявное приведение типов (делается за нас)
        int x = (int) l; // Явное
        System.out.println(x);

        double d = 123.5;
        int y = (int) d;
        System.out.println(y);
        long l1 = Math.round(d);
        System.out.println(l1);

        byte b = (byte) 256;
        System.out.println(b);
    }
}
