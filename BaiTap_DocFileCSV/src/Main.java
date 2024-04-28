import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
//    public static void main(String[] args) {
//        try {
//            File file = new File("BaiTap_DocFileCSV/src/Country.csv");
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(parseCsvLine(line));
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static List<String> parseCsvLine(String csvLine) {
//        List<String> result = new ArrayList<>();
//        if(csvLine!=null){
//            String[] splitData = csvLine.split(",");
//            for (int i = 0; i < splitData.length; i++) {
//            result.add(splitData[i]);
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {
        try {
            File file = new File("BaiTap_DocFileCSV/src/Country.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
           while ((line = bufferedReader.readLine())!=null){
               System.out.println(parseCSV(line));
           }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<String> parseCSV(String csvLine) {
        List<String> list = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = new String[1];
            splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                list.add(splitData[i]);
            }
        }
        return list;
    }
}