package array;

public class ArrayTestQn5 {
    //A
    public static void main(String[] args) {

        String subject[] = new String[5];
        int marks[] = new int[5];
        int total = 0;

        subject[0] = "Math";
        subject[1] = "English";
        subject[2] = "Nepali";
        subject[3] = "Computer";
        subject[4] = "Science";

        marks[0] = 99;
        marks[1] = 80;
        marks[2] = 87;
        marks[3] = 88;
        marks[4] = 69;

        System.out.println("Subjests          Marks");
        System.out.println("---------        --------");
        for(int i=0; i<5; i++){
             total = total +marks[i];
            System.out.println(subject[i]+"                "+marks[i]);
        }
        System.out.println("---------        --------");
        System.out.println("Total                  "+total);
        double per = 5/total;
        System.out.println("Percentage               "+per*100+"%");
    }
}
