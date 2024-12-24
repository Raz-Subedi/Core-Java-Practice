package method;

public class MethodTestArea {
    public static void main(String[] args) {

        circleArea();
        rectangleArea();
        triangleArea();
    }

    static void circleArea(){
        int r = 7;

        int a = 22/7*r*r;
        System.out.println("The Area of Circle is:"+a);
    }

    static void rectangleArea(){
        int l = 10;
        int b = 5;

        int a = l*b;
        System.out.println("The Area of Rectangle is :"+a);
    }

    static void triangleArea(){
        int b = 10;
        int h = 15;

        int a = (b*h)/2;
        System.out.println("The Area if Triangle is:"+a);
    }
}
