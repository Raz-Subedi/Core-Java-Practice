package multithreading;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
        try {
            Thread.sleep(2000); // Simulate some work
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " has finished.");
    }
}

public class JoinExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        try {
            t1.join(); // Ensures t1 completes before t2 starts
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        t2.start();
        try {
            t2.join(); // Ensures main thread waits for t2 to complete
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread continues after t1 and t2 have finished.");
    }
}


