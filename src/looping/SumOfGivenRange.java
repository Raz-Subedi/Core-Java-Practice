package looping;

import java.util.Scanner;

public class SumOfGivenRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Starting range");
        int start = sc.nextInt();
        System.out.println("Enter a Ending range");
        int end = sc.nextInt();
        int s =0;

        for (int i=start;i<=end;i++){
//            System.out.println(i);
            s = s+i;
        }
        System.out.println("The Sum is :"+s);
    }
}
