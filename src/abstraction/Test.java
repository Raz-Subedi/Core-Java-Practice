package abstraction;

public class Test {
    public static void main(String[] args) {

        CentralBank b = new KumariBank();

        b.getInterestRate();
        b.getBankName();
        b.moneyExchangeRate();

        UserService us = new UserServiceImpl();
        us.addUser();
        us.deleteUser();
        us.print();

//        CommonService cs = new UserServiceImpl();
//        cs.print();
    }
}
