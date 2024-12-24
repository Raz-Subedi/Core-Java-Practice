package innerclass;

class An{

    public void show(){
        System.out.println("I am in A");
    }
}



public class AnonymousClass{

    public static void main(String[] args){

        An ob = new An()
        {

            public void show(){
                System.out.println("I am in Object before a semicolon");
            }

        };

        ob.show();
    }

}

