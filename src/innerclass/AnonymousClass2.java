package innerclass;

// Java Program to Illustrate Anonymous Inner Classes


// Interface
interface Hello {

    void show();
}


class AnonymousClass2 {

    static Hello h = new Hello() {


        public void show()
        {
            // Print statement
            System.out.println("i am in anonymous class");
        }
    };


    public static void main(String[] args)
    {
        h.show();
    }
}

