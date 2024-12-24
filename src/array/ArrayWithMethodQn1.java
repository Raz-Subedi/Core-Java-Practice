package array;

import java.util.Arrays;

public class ArrayWithMethodQn1 {
    //WAP to pass and print name of 5 cities using method.




    public static void main(String[] args) {

        String[] c = {"Kathmandu","Pokhara","Butwal","jhapa","Illam"};
        cities(c);

        char[] vow = getVowel();
        System.out.println("The Vowel Letters are : "+ Arrays.toString(vow));

        int[] od = getOddNumbers();
        System.out.println("The Odd numbers from 1 to 100 are :"+Arrays.toString(od));

        int[] div = getNumbersExactlyDivisibleBy5();
        System.out.println("The number between 20 and 120 exactly divisible by 5 are :"+Arrays.toString(div));

    }




    static void cities(String[] values){

        for(String x:values){
            System.out.println("The Cities are : "+x);
        }
    }





//    -----------------array as return type-------------------
//    WAP to create array of vowels and return from method.
    static char[] getVowel(){

        char[] vowel ={'a','e','i','o','u'};
        return vowel;
    }





//WAP to return of odd numbers from 1 to 100 using method.
    static int[] getOddNumbers(){

        int odd[] = new int[50];
        int index = 0;

        for( int i=1; i<=100; i++){
            if(i%2==1){
                odd[index] = i;
                index++;
            }
        }
        return odd;
    }






//    WAP to return array of numbers between 20 to 120 which is exactly divisible by 5 using method.

    static int[] getNumbersExactlyDivisibleBy5(){

        int[] Ediv = new int[21];
        int index = 0;

        for(int i=20; i<=120; i++){
            if(i%5==0){
                Ediv[index]=i;
                index++;
            }
        }
        return Ediv;
    }
}

