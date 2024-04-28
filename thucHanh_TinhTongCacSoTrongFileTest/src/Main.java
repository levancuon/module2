import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("nhap duong dan file");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExamble readFileExamble=new ReadFileExamble();
        readFileExamble.readFileText(path);
    }
}