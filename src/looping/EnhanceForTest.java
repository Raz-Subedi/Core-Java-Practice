package looping;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class EnhanceForTest {
    /*-----------Enhance For Loop / For Each Loop---------------
    - use to read data from collection (Array, List, Set, Map etc.)

     */
    public static void main(String[] args) {

        int[] values = {45,15,78,96,85,12,36,25,52};

         int s =0;
        for(int x : values){
            System.out.println(x);
            s = s+x;
        }
        System.out.println("Total = "+s);
    }
}
