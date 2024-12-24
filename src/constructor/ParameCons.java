package constructor;

public class ParameCons {
    public static void main(String[] args) {
//        Cat cat2 = new Cat();
        Cat cat1 = new Cat("P1",10);

        System.out.println("Name = " + cat1.name + "\n age = " + cat1.age);
    }
}
class Cat{
    String name;
    int age;
    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
}
