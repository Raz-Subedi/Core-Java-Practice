package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileUsingStream {

    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream("e:5pm.txt");

        file.write("GoodEvening!!".getBytes());
        file.close();
        System.out.println("Success");
    }
}
