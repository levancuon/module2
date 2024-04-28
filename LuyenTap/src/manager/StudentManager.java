package manager;

import manager.dto.ReadAndWriteFileStudent;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> listManager;
    private ReadAndWriteFileStudent readAndWriteFileStudent;

    public StudentManager() {

        this.readAndWriteFileStudent = new ReadAndWriteFileStudent();
        this.listManager = readAndWriteFileStudent.readFile();
    }

    public void add(Student student) {
        listManager.add(student);
        readAndWriteFileStudent.writeFile(listManager);
    }

    public ArrayList<Student> getListManager() {
        return this.listManager;
    }
}
