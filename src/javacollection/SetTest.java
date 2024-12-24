package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {

//        Set<String> set = new HashSet<>();  -->unique
//        Set<String> set = new TreeSet<>();   -->unique + sorted
        Set<String> set = new LinkedHashSet<>();  // -->unique + order of insertion

        set.add("Kathmandu");
        set.add("Pokhara");
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Okhaldhunga");
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Kathmandu");


        for(String s :set){
            System.out.println(s);
        }
    }
}
