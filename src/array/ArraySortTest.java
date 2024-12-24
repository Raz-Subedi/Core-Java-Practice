package array;

import java.util.Arrays;

public class ArraySortTest {

    public static void main(String[] args) {

        int[] array = {14,12,58,7,88,9,56,245,34,45,22,75,265};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for(int i= array.length-1; i>=0; i--){
            System.out.println(array[i]+" ");
        }
    }
}
