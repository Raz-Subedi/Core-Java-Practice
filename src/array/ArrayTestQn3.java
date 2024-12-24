package array;

public class ArrayTestQn3 {
//    WAP to store and print odd numbers from 1 to 100
public static void main(String[] args) {

    int odd[] = new int[50];
    int index = 0;


    for(int i=0; i<=100; i++){
        if(i%2==1){
            odd[index] = i;
            index ++;
        }
    }
    for (int x:odd){
        System.out.println("The Odd Numbers are: "+x);
    }
}
}
