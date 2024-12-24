package enumeration;

// A Java program to demonstrate that we can have
// main() inside enum class.

public enum Main{
    RED,
    GREEN,
    BLUE;

    // Driver method
    public static void main(String[] args) {
        Main c1 = Main.RED;
        System.out.println(c1);
    }
}

