package selection;

import java.util.Scanner;

public class SwitchQn2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        System.out.println("Enter Operation's symbols that you want to perform :");
        char ch = sc.next().charAt(0);

        switch (ch){
            case '+':
                System.out.println("Enter First Number");
                int a = sc.nextInt();
                System.out.println("Enter Second Number");
                int b = sc.nextInt();
                int add = a+b;
                System.out.println("The Sum is :"+add);
                break;

            case '-':
                System.out.println("Enter First Number");
                int c = sc.nextInt();
                System.out.println("Enter Second Number");
                int d = sc.nextInt();
                int sub = c-d;
                System.out.println("The Subtraction is :"+sub);
                break;

            case '*':
                System.out.println("Enter First Number");
                int e = sc.nextInt();
                System.out.println("Enter Second Number");
                int f = sc.nextInt();
                int mul = e*f;
                System.out.println("The Multiplication is :"+mul);
                break;

            case '/':
                System.out.println("Enter the Number");
                int g = sc.nextInt();
                System.out.println("Enter the Divisor");
                int h = sc.nextInt();
                int div = g/h;
                System.out.println("The Quotient is :"+div);
                break;

            default:
                System.out.println("Invalid Operation Symbol");
        }
    }
}
