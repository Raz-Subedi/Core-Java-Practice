package abstraction;

interface Draw{
    void draw();
    static int cube(int x){return x*x*x;}
}
class Rect implements Draw{
    public void draw(){System.out.println("drawing rectangle");}
}

class TestInterfaceStatic{
    public static void main(String args[]){
        Draw d=new Rect();
        d.draw();
        System.out.println(Draw.cube(3));
    }}
