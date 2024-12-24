package datatype;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        //WAP to find area of rectangle

        int l;
        int b;

        //Scanner class is used to read data from keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of l:");
        l = sc.nextInt();
        System.out.println("Enter value of b:");
        b = sc.nextInt();

        int area=l*b;
        System.out.println("Area "+area);
    }
}
