package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileUsingStream {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("e:5pm.txt");

        int data;
        while((data = file.read()) != -1){
            System.out.print((char)data);
        }
    }
}
