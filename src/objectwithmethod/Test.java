package objectwithmethod;

import objectwitharray.Product;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Customer cr = new Customer();
        cr.setId(11);
        cr.setAge(55);
        cr.setCity("Kathmandu");
        cr.setName("Raz");
        cr.setPhone("9875641230");


        //------object as parameter
        Test t = new Test();
        t.printCustomer(cr);


      //------object as return type
        Customer cc=t.getCustomerData();
        System.out.println(cc);
        t.printCustomer(cc);

    }

    //-----------object as parameter
    void printCustomer(Customer c){

        System.out.println("Id ="+c.getId());
        System.out.println("Name ="+c.getName());
        System.out.println("City ="+c.getCity());
        System.out.println("Phone ="+c.getPhone());
        System.out.println("Age ="+c.getAge());
    }



    //------------object as return type-----------
    Customer getCustomerData(){
        Customer cr = new Customer();
        cr.setId(11);
        cr.setAge(55);
        cr.setCity("Kathmandu");
        cr.setName("Raz");
        cr.setPhone("9875641230");

        return cr;
    }

}
