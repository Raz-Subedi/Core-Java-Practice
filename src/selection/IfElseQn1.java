package selection;

import java.util.Scanner;

public class IfElseQn1 {
//    WAP to print  the smallest number between two int values.
    public static void main(String[] args) {

        int a,b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        a = sc.nextInt();
        System.out.println("Enter the second number :");
        b = sc.nextInt();

        if(a<b){
            System.out.println(a+" is the smallest Number");
        }
        else{
            System.out.println(b+" is the smallest number");
        }
    }
}
