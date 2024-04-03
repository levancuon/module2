import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double width;
        double height;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập width");
        width = input.nextDouble();
        System.out.println("nhập height");
        height = input.nextDouble();
        System.out.println("Area = "+(width*height)+" m2");



    }
}
