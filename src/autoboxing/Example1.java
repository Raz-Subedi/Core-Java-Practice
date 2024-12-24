package autoboxing;

import java.io.*;
public class Example1 {


        // Main driver method
        public static void main(String[] args)
        {

            int num = 10;
//            Integer num1 = new Integer(num1);   // Boxing

                Integer num1 = num;  //Autoboxing
            // Print statements
            System.out.println("Value of num:" + num);
            System.out.println("Value of num1: " + num1);

//            int num2 = num1.intValue();  // Unboxing
            int num2 = num1;   // Auto Unboxing
            System.out.println(num2);

            String str = "13";

            int num3 = Integer.parseInt(str);
            System.out.println(num3*2);

        }
    }


