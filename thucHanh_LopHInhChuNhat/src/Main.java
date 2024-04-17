import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("nhap width");
        double width = input.nextDouble();
        System.out.println("nhap height");
        double height = input.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle);
    }
}