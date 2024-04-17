package First;

import java.util.Arrays;

public class StudentManagement extends Student {

    public Student[] students;
    public int index;

    public StudentManagement(int id, String name, double[] scores, String gender) {
        super(id, name, scores, gender);
    }
    public int addElement(Student student,int size){
        students=new Student[size];
        students[index]=student;
        index++;
        return index;
    }
    public void showElement(){
        System.out.println(Arrays.toString(students));
    }




}

