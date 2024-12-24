package array;

import java.util.Scanner;

public class MultiDimArray {
//    use to represent data in column and row form or matrix form

    public static void main(String[] args) {


//        Create Array
        int mat[][] = new int[2][2];

    /*      c0  c1
          R0[]  []
          R1[]  []
     */

//        Write data in array

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<2; i++){

            for (int j=0; j<2; j++){

                System.out.println("Enter value");
                mat[i][j] = sc.nextInt();
            }
        }

//        Read data from array.

        for(int i=0; i<2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }

}
