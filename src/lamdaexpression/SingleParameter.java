package lamdaexpression;

interface Name{
    public String say(String name);
}

public class SingleParameter{
    public static void main(String[] args) {

        // Lambda expression with single parameter.
        Name s1=(name)->{
            return "Hello, "+name;
        };
        System.out.println(s1.say("Raz"));

        // You can omit function parentheses
        Name s2= name ->{
            return "Hello, "+name;
        };
        System.out.println(s2.say("Subedi"));
    }
}
