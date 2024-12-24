package abstraction;

public abstract class CentralBank {

    abstract void getBankName();
    abstract void getInterestRate();

    void moneyExchangeRate(){
        System.out.println("$1 = 32");
        System.out.println("KDD 1 = 16");
        System.out.println("Yen 10 = 10");
    }
}
