package array;

import java.util.Scanner;

public class ArrayTestQn2 {
    //    WAP to store and print name of 6 cities.

    public static void main(String[] args) {

        String cities[] = new String[6];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of 6 cities");
        for(int i=0; i<6; i++){
            cities[i] = sc.nextLine();
        }
        for(String x : cities) {
            System.out.println("The Cities are :" +x);
        }
    }
}
