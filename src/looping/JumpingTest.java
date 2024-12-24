package looping;

public class JumpingTest {

    /*------------Jumping----------
    a> break;
    b> continue;
    c> returm;
     */
    public static void main(String[] args) {

        for(int i=1; i<=10; i++){

            if(i == 5 || i == 8) {
//                break;                   exit form loop
//                continue;                skip  values
                return;                //  exit form method
            }
            System.out.println(i);
        }
        System.out.println("-----end for loop-----");
    }
}
