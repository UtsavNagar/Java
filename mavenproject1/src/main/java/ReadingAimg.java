import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingAimg {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // reading writing a binary file
//        String inputFilePath = "/home/utsav/JavaPrograms/Programs/ss.png";
//        String outputFilePath = "/home/utsav/JavaPrograms/Programs/output.png";
//
//        FileInputStream f1 = new FileInputStream(inputFilePath);
//        int n = f1.available();
//        byte b[] = new byte[n];
//        
//        f1.read(b);
//        f1.close();
//        
//        FileOutputStream f2 = new FileOutputStream(outputFilePath);
//        f2.write(b);
//        f2.close();


        // reader writer
        String path1 = "/home/utsav/JavaPrograms/Programs/fileWriting.txt";
        FileWriter fw = new FileWriter(path1);
        String s1 = "Hello bhai kesa hai!";
        fw.write(s1);
        fw.close();
    }
}
