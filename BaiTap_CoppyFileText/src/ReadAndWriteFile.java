import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        try {
            File souceFile = new File("BaiTap_CoppyFileText/src/Data");
            File targetFile = new File("BaiTap_CoppyFileText/src/filecoppy");
            FileReader fileReader =new FileReader(souceFile);
            FileWriter fileWriter = new FileWriter(targetFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
