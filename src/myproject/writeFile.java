package myproject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeFile {

    public static void main(String[] args) {
        String myContent = "My name is John\n I'm a developer";

        try {
            String filepath = "C:\\\\Users\\\\jmulongo\\\\Desktop\\\\";
            File myfilelocation = new File(filepath+"JavaExample.txt");
            // write data to file
            FileOutputStream myfile = new FileOutputStream(myfilelocation);

            if (myfilelocation.exists()) {
                byte[] bytesArray = myContent.getBytes();
                myfile.write(bytesArray);
                myfile.flush();
                System.out.println("Data added to file");
            } else {
                myfilelocation.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("There is a problem with your file path");
        }
    }
}
