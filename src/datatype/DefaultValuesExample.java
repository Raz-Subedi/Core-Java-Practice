package datatype;

public class DefaultValuesExample {
    // Primitive data types
    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;

    // Reference types
    String stringVar;
    Object objectVar;
    int[] arrayVar;

    public static void main(String[] args) {
        DefaultValuesExample example = new DefaultValuesExample();

        System.out.println("Default byte: " + example.byteVar);
        System.out.println("Default short: " + example.shortVar);
        System.out.println("Default int: " + example.intVar);
        System.out.println("Default long: " + example.longVar);
        System.out.println("Default float: " + example.floatVar);
        System.out.println("Default double: " + example.doubleVar);
        System.out.println("Default char: [" + example.charVar + "]"); // Empty output means '\u0000'
        System.out.println("Default boolean: " + example.booleanVar);
        System.out.println("Default String: " + example.stringVar);
        System.out.println("Default Object: " + example.objectVar);
        System.out.println("Default Array: " + example.arrayVar);
    }
}

