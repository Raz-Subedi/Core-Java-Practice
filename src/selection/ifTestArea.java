package selection;

public class ifTestArea {
    //WAP to find area of rectangle where value of l and b are not zero.
    public static void main(String[] args) {

        int l = 50;
        int b = 20;

        int area = l * b;

        if (l!= 0 && b!= 0) {
            System.out.println("Area = "+area);
        }
    }
}