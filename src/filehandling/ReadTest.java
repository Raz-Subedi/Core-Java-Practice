package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {
    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("e:user.csv");

        BufferedReader br = new BufferedReader(file);

        String line;
        br.readLine(); //skip header

        while((line = br.readLine()) != null){
            System.out.println(line);

           String[] data = line.split(",");

            System.out.println(data[4]);
            //db connection
            //write sql and set values to sql
            //execute
        }

    }
}
