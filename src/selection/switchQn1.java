package selection;

import java.util.Scanner;

public class switchQn1 {
    public static void main(String[] args) {

        String post;

        Scanner sc = new Scanner((System.in));
        System.out.println("Enter your Post");
        post = sc.nextLine();

        switch (post){
            case "MD":
                double  bonus = 0.2*230000;
                double totalSalary = bonus + 230000;
                System.out.println("The Total Salary is :"+totalSalary);
                break;

            case "CEO":
                double bonu = 0.2579*250000;
                double totalsaalar=bonu + 250000;
                System.out.println("The Total Salary is :"+totalsaalar);
                break;

            case "MANAGER":
                double bon = 0.16*176000;
                double totalsaala = bon + 176000;
                System.out.println("The Total Salary is :"+totalsaala);
                break;

            case "HELPER":
                double bo = 0.09*145900;
                double totalsaal = bo + 145900;
                System.out.println("The Total Salary is :"+totalsaal);
                break;

            default:
                System.out.println("Invalid Post");
        }
    }
}
