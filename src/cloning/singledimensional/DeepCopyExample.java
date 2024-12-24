package cloning.singledimensional;

public class DeepCopyExample {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3};
        int[] clonedArray = originalArray.clone();

        // Modifying cloned array
        clonedArray[0] = 99;

        // Print both arrays
        System.out.println("Original Array: " + java.util.Arrays.toString(originalArray));
        System.out.println("Cloned Array: " + java.util.Arrays.toString(clonedArray));
    }
}

