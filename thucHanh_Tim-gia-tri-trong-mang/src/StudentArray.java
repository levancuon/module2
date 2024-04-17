import java.util.Scanner;

public class StudentArray {
    /*public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }
    }

     */
    public static void main(String[] args) {
        String[] arr = {"ga","heo","dog","ga"};
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhập tên");
        String str=scanner.nextLine();
        boolean exist = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)){
                System.out.println(" tìm thấy ở vị trí số "+i);
                exist=true;
                break;
            }
        }
        if(!exist){
            System.out.println("ko tìm thấy");
        }

    }

}
