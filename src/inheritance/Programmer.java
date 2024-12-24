package inheritance;

public class Programmer extends Employee{

   public String proglang;
    public String project;
    public int bonus;

    public void print(){

        super.print();
        System.out.println("Programming Language ="+proglang);
        System.out.println("Project ="+project);
        System.out.println("Bonus ="+bonus);
    }
}
