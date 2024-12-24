package cloning.singledimensional;

public class ShallowCopyExample {
    public static void main(String[] args) {
        String[] originalArray = {"Apple", "Banana", "Cherry"};
        String[] clonedArray = originalArray.clone();

        // Modifying cloned array
        clonedArray[0] = "Orange";

        // Print both arrays
        System.out.println("Original Array: " + java.util.Arrays.toString(originalArray));
        System.out.println("Cloned Array: " + java.util.Arrays.toString(clonedArray));

        //Here, changing an element in the clonedArray does not affect originalArray because
        // strings are immutable. But if these were objects, like Person, any changes to an
        // object's fields would reflect in both arrays.
    }
}

