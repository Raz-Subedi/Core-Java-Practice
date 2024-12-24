package selection;

public class NestedIfElseTest {
    public static void main(String[] args) {

        String citizen = "Nepali";
        int age = 70;
        boolean haveVoterId = false;

        if (citizen.equals("Nepali")){

            if(age >= 18){

                if(haveVoterId){
                    System.out.println("You can Vote!!");
                }
                else{
                    System.out.println("You dont have voter Id!!!");
                }
            }
            else{
                System.out.println("You are under Age");
            }
        }
        else{
            System.out.println("Invalid Citizenship !!");
        }
    }
}
