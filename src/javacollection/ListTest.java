package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();

        list.add("Nepal");
        list.add("Japan");
        list.add("India");
        list.add("Korea");

//        list.remove(2);
//        list.remove("Korea");
//        list.clear();

        System.out.println(list.contains("India"));

        for(String s:list){
            System.out.println(s);
        }

    }
}
