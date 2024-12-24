package tostring;


class Laptop {
    String model;
    int price;

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public boolean equals(Laptop that) {
        {
            return this.model.equals(that.model) && this.price == that.price;
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo";
        obj1.price  = 10000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo1";
        obj2.price  = 10000;


//        boolean result = obj1 == obj2;
        boolean result = obj1.equals(obj2);
        System.out.println(result);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}

