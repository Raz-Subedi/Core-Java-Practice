package selection;

import java.util.Scanner;

public class ifTestSI {
    //WAP to find SI where value of p,t and r not zero.

    public static void main(String[] args) {
        int p;
        int t;
        int r;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Principal :");
        p= sc.nextInt();
        System.out.println("Enter a Time :");
        t=sc.nextInt();
        System.out.println("Enter a Rate :");
        r=sc.nextInt();

        int si = (p*t*r)/100;

        if (p!=0 && t!=0 && r!=0){
            System.out.println("The Simple Interest is = "+si);
        }
    }
}
