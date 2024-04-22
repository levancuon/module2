import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        StudentManager studentManager = new StudentManager();
//        Scanner input = new Scanner(System.in);
//        int enterChoice = -1;
//        do {
//            System.out.println("1. Hien thi danh sach sv");
//            System.out.println("2. Them mot sinh vien vao danh sach");
//            System.out.println("3. Xoa sv");
//            System.out.println("4. Hien thi danh sach sv co GPA>8 ");
//            System.out.println("enter your choice");
//            enterChoice = input.nextInt();
//            switch (enterChoice) {
//                case 1:
//                    studentManager.displayStudents();
//                    break;
//                case 2:
//                    System.out.print("Enter student ID: ");
//                    int id = input.nextInt();
//                    System.out.print("Enter student name: ");
//                    String name = input.next();
//                    System.out.print("Enter student email: ");
//                    String email = input.next();
//                    System.out.print("Enter student GPA: ");
//                    double gpa = input.nextDouble();
//                    studentManager.addStudent(new Student(id, name, email, gpa));
//                    break;
//                case 3:
//                    System.out.print("Enter student ID to remove: ");
//                    int removeId = input.nextInt();
//                    studentManager.removeStudent(removeId);
//                    break;
//                case 4:
//                    studentManager.displayStudentsWithGPAOver8();
//                    break;
//            }
//
//        }   while (enterChoice != 0) ;


        System.out.println("nhập choice");
        Scanner input = new Scanner(System.in);
        int choice = -1;
        StudentManager studentManager = new StudentManager();

        do{
            System.out.println("1. Show list sv");
            System.out.println("2. Thêm sv");
            System.out.println("3. Xóa sv");
            System.out.println("4. Hiện sv có GPa > 8");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    studentManager.showList();
                    break;
                case 2:
                    studentManager.add(new Student(123,"awn","awnjd",6.5));
                    studentManager.add(new Student(123,"huy","awnjd",8.5));
                    break;
                case 3:
                    studentManager.delete(123);
                    break;
                case 4:
                    studentManager.GPa();
            }


        }while (choice != 0);

    }
}