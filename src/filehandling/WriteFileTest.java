package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileTest {

    public static void main(String[] args) throws IOException {

        FileWriter file = new FileWriter("e:student.txt", true);

        file.write("ID = 5555 \n");
        file.write("Name = Raz Subedi\n");
        file.write("College = NCC\n");
        file.write("RollNo =10\n");
        file.write("Phone = 956120378\n");

        file.close();
        System.out.println("Success");
    }
}
