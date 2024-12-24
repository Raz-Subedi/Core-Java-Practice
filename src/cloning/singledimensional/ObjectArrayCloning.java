package cloning.singledimensional;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class ObjectArrayCloning {
    public static void main(String[] args) {
        // Creating an array of Person objects
        Person[] originalArray = { new Person("Alice"), new Person("Bob"), new Person("Charlie") };

        // Cloning the array
        Person[] clonedArray = originalArray.clone();

        // Modifying an object in the cloned array
        clonedArray[0].name = "Alex";

        // Printing both arrays
        System.out.println("Original Array:");
        for (Person p : originalArray) {
            System.out.println(p.name);
        }

        System.out.println("\nCloned Array:");
        for (Person p : clonedArray) {
            System.out.println(p.name);
        }
    }
}

