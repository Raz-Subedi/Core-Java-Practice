package methodoverriding;

class Parent {
    public static void show() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {
    public static void show() {
        System.out.println("Static method in Child");
    }
}

public class Static {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent childAsParent = new Child();
        Child child = new Child();

        parent.show();           // Outputs: Static method in Parent
        childAsParent.show();     // Outputs: Static method in Parent (not overridden)
        child.show();             // Outputs: Static method in Child
    }
}
