package selection;

public class IfTest {
    /*-------if-------------
        Syntax:
        if(condition){
            //statements
            }
         */
    public static void main(String[] args) {

        int salary = 9000;

        if(salary < 30000) {
            salary = salary + 8000;
        }

        System.out.println("Your Total Salary = "+salary);
    }
}
