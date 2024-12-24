package javacollection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee emp = new Employee();
        for(int i=0; i<5; i++){
            emp.setId(1);
            emp.setName("Hero");
            emp.setPost("Senior Developer");
            emp.setAge(25);

            employees.add(emp);
        }

        for(Employee e:employees){
            System.out.println(e);
        }
    }
}
