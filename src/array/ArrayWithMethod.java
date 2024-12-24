package array;

import java.util.Arrays;

public class ArrayWithMethod {

    public static void main(String[] args) {

        int[] array = {12,45,78,89,56,2,3,12,45,75,14,12};
        add(array);

        String[] citz = getCities();
        System.out.println("The Cities are : "+ Arrays.toString(citz));

    }

//    -------------array as arguments---------------
    static void add(int[] values){

        int s =0;
        for(int x : values){
            s = s+x;
        }
        System.out.println("Total = "+s);
    }

    //    -----------------array as return type-------------------

    static String[] getCities(){

        String[] cities = {"Kathmandu","Pokhara","Butwal","Jhapa","Illam"};
        return cities;
    }

}
