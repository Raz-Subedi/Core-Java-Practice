package objectwithmethod;

public class ArrayTest {

    public static void main(String[] args) {

        Customer customers[] = new Customer[5];


        for(int i=0; i< customers.length; i++){

            Customer c = new Customer();
            c.setId(11);
            c.setAge(55);
            c.setCity("Kathmandu");
            c.setName("Raz");
            c.setPhone("9875641230");

            customers[i] =c;
        }
        ArrayTest t = new ArrayTest();
        t.printCustomerArray(customers);


        System.out.println();
        System.out.println();




        //------------object as return type----------
       Customer cust[] = t.getCustomers();
        for (Customer c : cust){
            System.out.println(c);
        }

    }


//-------object ko array as Parameter--------------
    void printCustomerArray(Customer[] customers) {

        for (Customer c : customers){
            System.out.println(c);
        }
    }

    Customer[] getCustomers() {

        // create array of customer
        Customer customers[] = new Customer[5];

        // write data in customer array
        for(int i=0; i< customers.length; i++){

            Customer c = new Customer();
            c.setId(1);
            c.setAge(85);
            c.setCity("mandu");
            c.setName("Raz Kumar Subedi ");
            c.setPhone("666000");

            customers[i] =c;
        }
        //return customer array
        return customers;
    }
}