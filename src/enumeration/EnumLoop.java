package enumeration;

// Java Program to Print all the values
// inside the enum using for loop
import java.io.*;

// Enum Declared
enum Color {
    RED,
    GREEN,
    BLUE;
}

// Driver Class
class EnumLoop {

    // Main Function
    public static void main(String[] args) {
        // Iterating over all the values in
        // enum using for loop
        for (Color var_1 : Color.values()) {
            System.out.println(var_1);
        }
    }
}

