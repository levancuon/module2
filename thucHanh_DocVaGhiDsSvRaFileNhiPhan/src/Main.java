import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis= new FileInputStream(path);
            ObjectInputStream ois= new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student( "Vũ Kiều Anh",1, "Hà Nội"));
        students.add(new Student( "Nguyễn Minh Quân",1, "Hà Nội"));
        students.add(new Student( "Đặng Huy Hoà", 1,"Đà Nẵng"));
        students.add(new Student( "Nguyễn Khánh Tùng",1, "Hà Nội"));
        students.add(new Student("Nguyễn Khắc Nhật",1, "Hà Nội"));
        writeDataToFile("thucHanh_DocVaGhiDsSvRaFileNhiPhan/src/student.txt", students);

        for (Student item: readDataFromFile("thucHanh_DocVaGhiDsSvRaFileNhiPhan/src/student.txt")){
            System.out.println(item);
        }
    }
}