package final_;

class Bike10{
    final int speedlimit;//blank final variable

    Bike10(){
        speedlimit=70;
        System.out.println(speedlimit);  // Blank Variable can be initialized once in constructor;

    }

//    static {
//        int speedlimit = 10;
//        System.out.println(speedlimit);
//    }

    public static void main(String args[]){
        new Bike10();
    }
}