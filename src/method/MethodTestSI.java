package method;

public class MethodTestSI {
    public static void main(String[] args) {

        calculateSI();
    }
    static void calculateSI(){
        int p = 1000;
        int t = 5;
        int r = 12;

        int si = (p*t*r)/100;
        System.out.println("The Simple Interest is :"+si);
    }
}
