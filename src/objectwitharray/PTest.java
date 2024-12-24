package objectwitharray;

import java.util.Scanner;

public class PTest {
    public static void main(String[] args) {

        //WAP to store and print data of 5 products.

        Product products[] = new Product[5];

        Scanner sc = new Scanner(System.in);


        // Write data in array

        for(int i=0; i< products.length;i++) {

            Product p = new Product();
            System.out.println("Enter ID:");
            p.setId(sc.nextInt());

            System.out.println("Enter Name:");
            p.setName(sc.next());

            System.out.println("Enter Company:");
            p.setCompany(sc.next());

            System.out.println("Enter Price:");
            p.setPrice(sc.nextInt());

            products[i] = p;
        }
        //Read data from array.

        int totalPrice = 0;

        for(Product pd:products) {
            if (pd.getCompany().equals("CG")){
                System.out.println(pd);
            totalPrice = totalPrice + pd.getPrice();
        }
        }
        System.out.println("Total Price ="+totalPrice);
    }
}
