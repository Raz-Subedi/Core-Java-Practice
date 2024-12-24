package filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) throws IOException {

        File file = new File("e:student.txt");

        System.out.println(file.isDirectory());
        System.out.println(file.exists());

        File folder = new File("e:myfiles");
//        folder.mkdir();

        //get all file names
     String[]  fileNames = folder.list();
        System.out.println(Arrays.toString(fileNames));

        //get all files
        File[] files = folder.listFiles();

        for(File f : files){

            System.out.println(Files.readString(Path.of(f.getAbsolutePath())));
        }

        Arrays.asList(files).stream().forEach(f ->
                {
                    try {
                        System.out.println(Files.readString(Path.of(f.getAbsolutePath())));
//                        Files.delete(Path.of(f.getAbsolutePath()));
//                        Files.copy(Path.of(f.getAbsolutePath()),Path.of("e:file5pm/"+f.getName()), StandardCopyOption.REPLACE_EXISTING);
                    }
                    catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                );

    }
}
