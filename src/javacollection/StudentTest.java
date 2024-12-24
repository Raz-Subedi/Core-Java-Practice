package javacollection;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {

        List<Student> students= new ArrayList<>();


        for(int i=0; i<5; i++) {
            Student s1 = new Student();
            s1.setId(1);
            s1.setName("Raz");
            s1.setCollege("NCC");

            students.add(s1);
        }

        for(Student s:students){
            System.out.println(s);
        }
    }
}
