package myproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class readFile {

    public static void main(String[] args) {
        String filepath = "C:\\\\Users\\\\jmulongo\\\\Desktop\\\\";
        File myfilelocation = new File(filepath+"JavaExample.txt");

        try {
            Scanner readData = new Scanner(myfilelocation);
            while (readData.hasNextLine()) {
                String content = readData.nextLine();
                System.out.println("File content::: ");
                System.out.println(content);
            }
            readData.close();
        } catch (FileNotFoundException e) {
            System.out.println("Can't read from your file.");
        }
    }
}
