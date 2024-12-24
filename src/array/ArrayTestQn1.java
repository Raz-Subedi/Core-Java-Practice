package array;

import java.util.Scanner;

public class ArrayTestQn1 {
//    WAP to store and print total, avg price of 10 books

    public static void main(String[] args) {

        int book[] = new int[10];
        int s = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of 10 books");
        for(int i=0; i<10; i++){
            book[i] = sc.nextInt();
            s = s+book[i];
        }
        int avg = s/10;
        System.out.println("The Average price of Book is :"+avg);
        System.out.println("The sum of 10 Book is :"+s);
    }
}

