package dateandtime;

import java.time.LocalDateTime;
import java.time.LocalTime; // import the LocalTime class

public class CurrentDateAndTime {
    public static void main(String[] args) {
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);
    }
}