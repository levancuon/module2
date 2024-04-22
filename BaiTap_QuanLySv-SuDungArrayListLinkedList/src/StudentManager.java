import java.util.ArrayList;


public class StudentManager {
//    public ArrayList<Student> students;
//
//    public StudentManager() {
//        this.students = new ArrayList<>();
//    }
//    public void displayStudents() {
//        System.out.println("List of Students:");
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }
//    public void addStudent(Student student) {
//        students.add(student);
//    }
//    public void removeStudent(int id) {
//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).getId() == id) {
//                students.remove(i);
//                System.out.println("Student with ID " + id + " removed.");
//                return;
//            }
//        }
//        System.out.println("Student with ID " + id + " not found.");
//    }
//    public void displayStudentsWithGPAOver8() {
//        System.out.println("Students with GPA > 8:");
//        for (Student student : students) {
//            if (student.getGPA() > 8) {
//                System.out.println(student);
//            }
//        }
//    }

    private ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }
    public void showList(){
        System.out.println("danh sách sv");
        for (Student item :students){
            System.out.println(item);
        }

    }
    public void add(Student student){
        students.add(student);
    }
    public void delete(int id){
        for (int i = 0; i < students.size(); i++) {
            if(id == students.get(i).getId()){
                students.remove(i);
            }
        }
    }
    public void GPa(){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getGPa()>8){
                System.out.println(students.get(i));
            }
        }
    }















}
