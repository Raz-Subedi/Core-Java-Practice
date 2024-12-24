package method_overloading;

// Java program for Method Overloading
// by Using Different Numbers of Arguments


class Helper2 {


    static int Multiply(int a, int b)
    {
        return a * b;
    }

//    static void Multiply(int a, int b)
//    {
//        System.out.println("Hello");      Cannot be overloaded by differing the return type.
//    }


    static int Multiply(int a, int b, int c)
    {
        return a * b * c;
    }
}


class DiffNumberOfArgument {


    public static void main(String[] args)
    {

        System.out.println(Helper2.Multiply(2, 4));
        System.out.println(Helper2.Multiply(2, 7, 3));


//        Helper2.Multiply(2.1, 4);
    }
}
