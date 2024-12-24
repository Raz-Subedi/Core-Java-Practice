package cloning.singledimensional;

public class MultiDimensionalArrayCloning {
    public static void main(String[] args) {
        // Creating a 2D array
        int[][] originalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Cloning the 2D array
        int[][] clonedArray = originalArray.clone();

        // Modifying an element in the cloned array
        clonedArray[0][0] = 99;

        // Printing the original and cloned arrays
        System.out.println("Original Array:");
        print2DArray(originalArray);

        System.out.println("\nCloned Array:");
        print2DArray(clonedArray);
    }

    // Helper method to print a 2D array
    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

