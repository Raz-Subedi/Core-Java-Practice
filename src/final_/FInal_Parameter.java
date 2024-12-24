package final_;

class FInal_Parameter {
    int cube(final int n){
//        n=n+2;//can't be changed as n is final
//        n*n*n;
        return n;
    }
    public static void main(String args[]){
        FInal_Parameter b=new FInal_Parameter();
        System.out.println(b.cube(5));
    }
}
