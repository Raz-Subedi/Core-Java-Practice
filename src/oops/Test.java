package oops;

public class Test {
    public static void main(String[] args) {

        Mobile m = new Mobile();
        m.company = " Redmi";
        m.model = "Note-11";
        m.price = 30000;

        m.printMobileInfo();

        Mobile m1 = new Mobile();
        m1.company = " Samsung";
        m1.model = "j5";
        m1.price = 35000;
        m1.printMobileInfo();

        Car c = new Car();
        c.name = "Ferrari";
        c.company = "Lamborgini";
        c.price = 5000000;
        c.printCarInfo();

        Bike b = new Bike();
        b.name = "MT-15";
        b.company = "Yamaha";
        b.price = 500000;
        b.printBikeInfo();

        Book bo = new Book();
        bo.name = "Software Engineering";
        bo.publication = "Pearson";
        bo.price = 12546;
        bo.printBookInfo();

        Dog d = new Dog();
        d.name = "Kutte ";
        d.age = 5;
        d.price = 25000;
        d.printDogInfo();

        Employee e = new Employee();
        e.name = "Raz hero";
        e.age = 55;
        e.id = 13;
        e.printEmployeeInfo();

    }
}
