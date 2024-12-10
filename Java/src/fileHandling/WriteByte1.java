package fileHandling;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class  WriteByte1 {
    public static void main(String[] args) {
        try { FileInputStream in = new FileInputStream("input.jpg");
             FileOutputStream out = new FileOutputStream("output.jpg"); 
            int byteData;
            while ((byteData = in.read()) != -1) {
                out.write(byteData);
            }
            System.out.println("File copied using byte stream.");
           
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
