package looping;

public class SumOfOddandEven {
    public static void main(String[] args) {

        int se = 0;
        int so = 0;

        for(int i=1;i<=100;i++){
            if(i%2==0){
                se =se+i;
            }
            else{
                so= so+i;
            }
        }
        System.out.println("Sum of Even Number : "+se);
        System.out.println("Sum of Odd Number :"+so);
        System.out.println("-----------------------------");
        System.out.println("Total = "+(se+so));
    }
}
