package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DogTest {
    public static void main(String[] args) {

        Set<Dog> dogs = new HashSet<>();


        Dog d1 = new Dog();
        d1.setAge(2);
        d1.setColor("Hariyo");
        d1.setName("Snake");

        dogs.add(d1);

        Dog d2 = new Dog();
        d2.setAge(5);
        d2.setColor("black");
        d2.setName("Kale");

        dogs.add(d2);

        Dog d3 = new Dog();
        d3.setAge(6);
        d3.setColor("Brown");
        d3.setName("Gore");

        dogs.add(d3);

        Dog d4 = new Dog();
        d4.setAge(4);
        d4.setColor("Brown");
        d4.setName("Hero");

        dogs.add(d4);

        Dog d5 = new Dog();
        d5.setAge(5);
        d5.setColor("black");
        d5.setName("Kale");

        dogs.add(d5);

        for(Dog d:dogs){
            System.out.println(d);

        }
    }
}
