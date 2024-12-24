package array;

import java.util.Arrays;

public class ArrayProcessingTest {

    public static void main(String[] args) {

        double[] array = {14,12,45,78,89,56,23,1,25,45,74,55,99,88,77,55};

        System.out.println(Arrays.toString(Arrays.copyOf(array,10)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(array,4,12)));

        Arrays.fill(array,200);
        System.out.println(Arrays.toString(array));

        Arrays.fill(array,5,12, Math.E);
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.binarySearch(array,200));
    }
}
