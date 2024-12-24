package abstraction;

public class KumariBank extends CentralBank {


    @Override
    void getBankName() {
        System.out.println("Kumar Bank");
    }

    @Override
    void getInterestRate() {
        System.out.println("20%");
    }
}
