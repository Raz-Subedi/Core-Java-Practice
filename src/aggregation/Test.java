package aggregation;

public class Test {

    public static void main(String[] args) {

        Car c = new Car();
        c.setColor("Black");
        c.setModel("XUV200");
        c.setPrice(5000000);

        Student s = new Student();
        s.setId(343);
        s.setName("Raz Subedi");
        s.setCollege("NCC");
        s.setRollno(11);
        s.setCar(c);

        System.out.println("Id ="+s.getId());
        System.out.println("Name ="+s.getName());
        System.out.println("-----Car Info-------");
        System.out.println("Color ="+s.getCar().getColor());
        System.out.println("Price ="+s.getCar().getPrice());
        System.out.println("Model ="+s.getCar().getModel());

    }
}
