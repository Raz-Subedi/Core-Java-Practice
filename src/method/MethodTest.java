package method;

public class MethodTest {
    public static void main(String[] args) {
        add();

        printTable(10);

        int x = findSumOf1To100();
        System.out.println("The Sum of 1 to 100 :"+x);

        int y = findSmallestValue(456, 789);
        System.out.println("The Smallest Number is:"+y);
    }

    //1.no return type with no arguments
    static void add(){   // main ma call garna static banako
        int a = 10;       // static main method le non static method object nabani call garna sakdain.
        int b = 20;

        int s= a+b;
        System.out.println("Sum = "+s);
    }

    //    2. no return type with arguments
    static void printTable(int n){
        for (int i=1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
    //    3. return type with no argument
    static int findSumOf1To100(){
        int s =0;

        for(int i =1; i<=100; i++){
            s = s+i;
        }
        return s;
    }

    //    4. return type with arguments
    static int findSmallestValue (int x,int y){
        if(x<y){
            return x;
        }
        return y;
    }

}
