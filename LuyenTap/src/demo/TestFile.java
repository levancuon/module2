package demo;

import java.io.*;
import java.nio.Buffer;

public class TestFile {
    public static void main(String[] args) throws IOException {
//        File file = new File("data.txt");
//        file.createNewFile();
//        System.out.println(file.exists());

        File file = new File("data");
        file.mkdirs();
        File file1 = new File("data/student.csv");
        file1.createNewFile();

//        System.out.println(file1.length()+" byte");

        FileWriter fileWriter = new FileWriter(file1);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("nhu cc");
        bufferedWriter.close();

        FileReader fileReader = new FileReader(file1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());

//        String line = null;
//        while ((line = bufferedReader.readLine())!= null){
//            System.out.println( line);
//        }



    }
}