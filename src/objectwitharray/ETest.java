package objectwitharray;

import java.util.Scanner;

public class ETest {

    public static void main(String[] args) {

        Employee emp[]= new Employee[4];

        Scanner sc = new Scanner(System.in);

        //Write data in array
        for (int i=0;i< 4;i++){

            Employee e = new Employee();

            System.out.println("Enter Employee Id:");
            e.setId(sc.nextInt());

            System.out.println("Enter Employee Name:");
            e.setName(sc.next());

            System.out.println("Enter Employee Company:");
            e.setCompany(sc.next());

            System.out.println("Enter Employee Salary:");
            e.setSalary(sc.nextInt());

            System.out.println("Enter Employee Department:");
            e.setDepartment(sc.next());

            System.out.println("Enter Employee Post:");
            e.setPost(sc.next());

            System.out.println("Enter Employee City:");
            e.setCity(sc.next());

            emp[i]=e;
        }

        // Read data from array

        int countadmin =0;
        int countcity =0;
        int totalSalary = 0;
        int itSalary = 0;
        int maxSalary =0;
        int minSalary = 0;

        for(Employee ep:emp) {

            if (ep.getDepartment().equals("IT")) {
                System.out.println(ep);
                itSalary = itSalary +ep.getSalary();
            }

            else if (ep.getDepartment().equals("Admin")) {
                countadmin++;
            }

            else if (ep.getCity().equals("Kathmandu")) {
                System.out.println(ep);
                countcity++;
            }

            else if (ep.getSalary()>maxSalary) {
                maxSalary = ep.getSalary();
            }

//            else if (ep.getSalary()) {
//
//            }
            totalSalary = totalSalary + ep.getSalary();

        }
        System.out.println("The Total Salary of Employee is:"+totalSalary);
        System.out.println("The Employees in Admin Department are:"+countadmin);
        System.out.println("The number of employee in Kathmandu are :"+countcity);
        System.out.println("The Salary of It Department is :"+itSalary);
        System.out.println("The Highest Salary is :"+maxSalary);
        System.out.println("The Lowest Salary is :"+minSalary);
    }
}
