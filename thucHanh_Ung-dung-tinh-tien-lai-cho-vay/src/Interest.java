import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so thang goi");
        int month = input.nextInt();
        System.out.println("nhap so tien goi");
        double money = input.nextDouble();
        double interestRate= 1.0;
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money*(interestRate/10)/12*month;
        }
        System.out.println("tien lai = "+totalInterest);
    }
}
