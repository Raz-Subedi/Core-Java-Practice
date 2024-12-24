package looping;

public class DoWhileTest {
    public static void main(String[] args) {

        int n = 14568;
        int i = 1;

        do{
            System.out.println(n+" x "+i+"  = "+(n*i));

            i++;
        }while(i<=10);
    }
}
