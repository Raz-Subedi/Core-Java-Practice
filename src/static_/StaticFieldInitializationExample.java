package static_;

public class StaticFieldInitializationExample {
    public static int myStaticField = 10;
    static {
        System.out.println("Static initialization block");
        myStaticField = 20;
    }
    public static void main(String[] args) {
        System.out.println("Static field value: " + myStaticField);
    }
}