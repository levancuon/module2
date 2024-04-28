package manager;

public class main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
//        studentManager.add(new Student("cc",123));
//        studentManager.add(new Student("vc",321));
        for(Student item: studentManager.getListManager()){
            System.out.println(item);
        }


    }
}
