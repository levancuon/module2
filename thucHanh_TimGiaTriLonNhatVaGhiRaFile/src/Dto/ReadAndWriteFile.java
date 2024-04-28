package Dto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
     List<Integer> numbers = new ArrayList<>();
     try {
         File file = new File(filePath);
         if (!file.exists()){
             throw new FileNotFoundException();
         }
         FileReader fileReader = new FileReader(file);
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         String line = "";
         while ((line = bufferedReader.readLine())!=null){
            numbers.add(Integer.parseInt(line));
         }
         bufferedReader.close();
     } catch (IOException e){
         System.out.println(e.getMessage());
     }return numbers;
  }
    public void writeFile(String filePath, int max) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Max value = "+ max);
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

