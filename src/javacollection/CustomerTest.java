package javacollection;

import java.util.HashSet;
import java.util.Set;

public class CustomerTest {
    public static void main(String[] args) {

        Set<Customer> customers = new HashSet<>();

        Customer c1 = new Customer();
        c1.setId(1);
        c1.setAge(22);
        c1.setName("Raz");

        customers.add(c1);

        Customer c2 = new Customer();
        c2.setId(1);
        c2.setAge(22);
        c2.setName("Raz");

        customers.add(c2);

        for(Customer c:customers){
            System.out.println(c);

        }
    }
}
