package methodoverriding;

public class Test {

    public static void main(String[] args) {

        //static or early binding of objects
        NabilBank nb = new NabilBank();

        nb.getBankName();
        nb.getInterestRate();

        //up-casting
        CentralBank b = new NabilBank();
        CentralBank p = new PrabhuBank();


        Test t = new Test();
        t.printBankInfo(p);
    }

    //late or dynamic binding of object
    //runtime polymorphism
    void printBankInfo(CentralBank bn){
        bn.getBankName();
        bn.getInterestRate();
    }
}
