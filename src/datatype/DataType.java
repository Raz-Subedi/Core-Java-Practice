package datatype;

public class DataType {
    public static void main(String[] args) {
     long a = 6000000000000l;
     float p = 1.5f;
        System.out.println("byte = "+Byte.SIZE+" "+Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
        System.out.println("short = "+Short.SIZE+" "+Short.MIN_VALUE+" "+Short.MAX_VALUE);
        System.out.println("int = "+Integer.SIZE+" "+Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
        System.out.println("long = "+Long.SIZE+" "+Long.MIN_VALUE+" "+Long.MAX_VALUE);
        System.out.println("float = "+Float.SIZE+" "+Float.MIN_VALUE+" "+Float.MAX_VALUE);
        System.out.println("double = "+Double.SIZE+" "+Double.MIN_VALUE+" "+Double.MAX_VALUE);
        System.out.println("char = "+Character.SIZE+" "+Character.MIN_VALUE+" "+Character.MAX_VALUE);
//        System.out.println("boolean = "+Boolean.SIZE+" "+Byte.MIN_VALUE+" "+Byte.MAX_VALUE);

        byte d = (byte)129;
        System.out.println(d);
        System.out.println(d);
        System.out.println(a);
        System.out.println(p);
    }
}
