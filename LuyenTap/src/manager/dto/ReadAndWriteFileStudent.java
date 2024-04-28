package manager.dto;

import manager.Student;
import manager.StudentManager;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteFileStudent {
    File file = new File("data/student.csv");

    public void writeFile(ArrayList<Student> list) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Student student : list) {
                line += student.getId() + "," + student.getName() + "\n";
            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Student> readFile() {
        ArrayList<Student> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Student student = new Student(data[1], Integer.parseInt(data[0]));
                list.add(student);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;

    }
}
