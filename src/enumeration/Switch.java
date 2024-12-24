package enumeration;

// Java Program to implement
// Enum in a Switch Statement
import java.io.*;

// Driver Class
class Switch {
    // Enum Declared
    enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW;
    }

    // Main Function
    public static void main(String[] args) {
        Color var_1 = Color.YELLOW;

        // Switch case with Enum
        switch (var_1) {
            case RED:
                System.out.println("Red color observed");
                break;
            case GREEN:
                System.out.println("Green color observed");
                break;
            case BLUE:
                System.out.println("Blue color observed");
                break;
            default:
                System.out.println("Other color observed");
        }
    }
}

