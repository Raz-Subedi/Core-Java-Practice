package constructor;

public class User {

    //-------------instance Variable-------------*
    String userName;
    String password;

    //---------------default Constructor--------------
    User(){
        userName = "root";
        password = "1234";
    }


    //-------------------Parameterized Constructor--------------------

    User(String userName, String password){  //-----local variable------
        this.userName = userName;
        this.password = password;
    }

    User(String userName){  //-----local variable------
        this.userName = userName;
    }

    void printUser(){
        System.out.println("UserName ="+userName);
        System.out.println("Password ="+password);
    }

    public static void main(String[] args) {

        User u = new User("Raz","111111");
        u.printUser();
    }
}
