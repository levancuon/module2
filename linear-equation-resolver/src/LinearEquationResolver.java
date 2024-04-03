import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập hệ số a,b :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        if (a==0){
            System.out.println(" Phuong trinh vo nghiem");
        } else {
            System.out.println("x = "+(-b/a));
        }
    }
}
