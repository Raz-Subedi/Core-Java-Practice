package generic;

// Generic Class
class Box<T> {
    private T value;

    // Constructor to initialize value
    public Box(T value) {
        this.value = value;
    }

    // Method to get value
    public T getValue() {
        return value;
    }

    // Method to set value
    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        // Creating a Box for Integer type
        Box<Integer> intBox = new Box<>(123);
        System.out.println("Integer value in Box: " + intBox.getValue());

        // Creating a Box for String type
        Box<String> strBox = new Box<>("Hello, Generics!");
        System.out.println("String value in Box: " + strBox.getValue());

        // Modifying values using setValue method
        intBox.setValue(456);
        strBox.setValue("Updated String");

        System.out.println("Updated Integer value in Box: " + intBox.getValue());
        System.out.println("Updated String value in Box: " + strBox.getValue());
    }
}

