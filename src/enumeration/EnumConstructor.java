package enumeration;

// Java program to demonstrate that enums can have
// constructor and concrete methods.

// An enum (Note enum keyword in place of class keyword)
enum Colors {
    GREEN,
    BLUE,
    RED;


    // Enum constructor called separately for each
    // constant
    private Colors() {
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo() {
        System.out.println("Universal Color");
    }
}

public class EnumConstructor {
    // Driver method
    public static void main(String[] args) {
        Colors c1 = Colors.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}

