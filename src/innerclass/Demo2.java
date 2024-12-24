
package innerclass;

class C {
    int age;

    public void show(){
        System.out.println("In show");
    }
    static class B{

        public void config(){
            System.out.println("In config");
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {

        C obj = new C();
        obj.show();

        C.B obj1 = new C.B();
        obj1.config();
    }
}
