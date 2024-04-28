import java.io.*;

public class ReadFileExamble {
    public void readFileText(String filePath) {
        File file = new File(filePath);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("Tong = " + sum);
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }


}
