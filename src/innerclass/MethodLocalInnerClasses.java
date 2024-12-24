package innerclass;

// Java Program to Illustrate Inner class can be
// declared within a method of outer class


class Outer {


    void outerMethod()
    {
        System.out.println("inside outerMethod");

        // Inner class
        // It is local to outerMethod()
        class Inner {

            // Method defined inside inner class
            void innerMethod()
            {

                System.out.println("inside innerMethod");
            }
        }

        // Creating object of inner class
        Inner y = new Inner();

        // Calling over method defined inside it
        y.innerMethod();
    }
}


class MethodLocalInnerClasses {


    public static void main(String[] args)
    {


        Outer x = new Outer();

        // Calling over the same method
        // as we did for inner class above
        x.outerMethod();
    }
}
