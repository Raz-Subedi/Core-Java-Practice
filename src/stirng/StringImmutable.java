package stirng;

public class StringImmutable {
    public static void main(String[] args) {
        String name = "raz";
        name = name + " subedi";
        System.out.println("Hello "+ name);

        String s1 = "Raz";
        String s2 = "Raz";
        System.out.println(s1 == s2);
    }
}
