package array;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {


        //1. Create Arary
       int age[] = new int[5];

       /*    0   1    2    3    4
           [10] [50] [20] [60] [70]
        */

       //2. Write data in array

//        age[2] = 20;
//        age[0] = 10;
//        age[1] = 50;
//        age[3] = 60;
//        age[4] = 70;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<age.length; i++) {
            System.out.println("Enter Age :");
            age[i] = sc.nextInt();
        }

        // 3. Read data from array
        for(int x : age) {
            System.out.println(x);
        }
    }
}
