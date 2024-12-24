package array;

public class ArrayTestQn4 {
    //    WAP to store and print odd numbers from 1 to 100
    public static void main(String[] args) {

        int even[] = new int[50];
        int index = 0;

        for(int i=1; i<=100; i++){
            if(i%2==0){
                even[index]=i;
                index++;
            }
        }

        for(int x:even){
            System.out.println("The Even Numbers are:"+x);
        }
    }
}
