package constructor;

// Java Program to Illustrate Initializer Block

// Class
class Car {

    // Class member variable
    int speed;

    // Constructor
    Car()
    {

        // Print statement when constructor is called
        System.out.println("Speed of Car: " + speed);
    }
    // Block
    {
        speed = 60;
    }
    // Class member method
    public static void main(String[] args)
    {

        Car obj = new Car();
    }
}
