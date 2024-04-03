import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double weight;
        double height;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap can nang (kg)");
        weight = input.nextDouble();
        System.out.println("nhap chieu cao (m)");
        height = input.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("underWeight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("overWeight");
        } else {
            System.out.println("obese");
        }
    }
}
